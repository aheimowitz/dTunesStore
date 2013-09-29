//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//---------------------------------------------------------------------
public class SearchWorker implements Runnable 
{
	private int numThreads;
	private String filename;
	private static MusicStore store;
	private static int currThreads;
	private static boolean eof;
	private static BufferedReader file;
	private static Results r1;
	private int debug_value;	

	/**
	*	This is the empty constructor used for each of the threads
	**/
	private SearchWorker()
	{
		if(debug_value == 4)
			System.out.println("Constructor Called");
	}

	/**
	*	This is the constructor for this class
        @param numThreads, filename, store
	**/
	public SearchWorker(int numThreads, String filename, MusicStore store, Results result) 
	{
		Debug d1 = new Debug();
		debug_value = d1.getValue();
		r1 = result;
		this.numThreads = numThreads;
		this.filename = filename;
		this.store = store;
		currThreads = 0;
		eof = false;

		if(debug_value == 4)
			System.out.println("Constructor Called");

		try
		{
			file = new BufferedReader(new FileReader(filename));
			String line = "";

			while(!eof)
			{
				Thread pop = null;
				if(currThreads < numThreads)
				{
					//Adds one to the currently running threads counter
					currThreads++;
					

					//Spawns a new thread
					pop = new Thread(new SearchWorker());

					//Starts the new thread
					pop.start();
				}
			}

			/*while(currThreads != 0);
			file.close();*/
		}
		catch(IOException e)
		{
			System.out.println("ERROR: file not found!");
			System.exit(1);
		}
	}



//---------------------------------------------------------------------
    /**
     This is the function that runs everytime a thread is created
    **/
	public void run()
	{
		if(debug_value == 3)
		{
			System.out.println("Run called");
		}

		try
		{
			String curline = file.readLine();

			if(curline != null)
			{
				if(store.getSong(curline) != null)
				{
					r1.addSongFound(store.getSong(curline));	
				}
			}
			else
			{
				eof = true;
			}
			
			currThreads--;			

		}
		catch (IOException e)
		{
			System.out.println("ERROR: Unable to read from file!");
			System.exit(2);
		}

	} // end run(...)

} // end class SearchWorker
//---------------------------------------------------------------------
