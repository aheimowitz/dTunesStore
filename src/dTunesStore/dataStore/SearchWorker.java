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

	/**
	*	This is the empty constructor used for each of the threads
	**/
	private SearchWorker()
	{
		
	}

	/**
	*	This is the constructor for this class
	**/
	public SearchWorker(int numThreads, String filename, MusicStore store) 
	{
		this.numThreads = numThreads;
		this.filename = filename;
		this.store = store;
		currThreads = 0;
		eof = false;

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

			//FIXME: Need a join here!
			if(currThreads == 0)
			{
				file.close();
			}

		}
		catch(IOException e)
		{
			System.out.println("ERROR: file not found!");
			System.exit(1);
		}
	}



//---------------------------------------------------------------------
	public void run()
	{
		try
		{
			String curline = file.readLine();

			if(curline != null)
			{
				//FIXME: Check that there is a song actually found.
				System.out.println(curline + "==" + store.getSong(curline));
					

				currThreads--;
			}
			else
			{
				eof = true;
			}
			
		}
		catch (IOException e)
		{
			System.out.println("ERROR: Unable to read from file!");
			System.exit(2);
		}

	} // end run(...)

} // end class SearchWorker
//---------------------------------------------------------------------
