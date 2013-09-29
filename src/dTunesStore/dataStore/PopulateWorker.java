//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//---------------------------------------------------------------------
public class PopulateWorker implements Runnable 
{
	private static int numThreads;
	private static int currThreads;
	private static BufferedReader file;
	private String filename;
	private static boolean eof;
	private static MusicStore musicStore;
//---------------------------------------------------------------------
	/**
	*	This is the default empty constructor that is used
	*	 each time a thread is created
	**/
	private PopulateWorker()
	{

	}
//---------------------------------------------------------------------
	/**
	*	This is the initial constructor that is called from the driver
	**/
	public PopulateWorker(int numThread, String filename, MusicStore store)
	{
		musicStore = store;
		numThreads = numThread;
		this.filename = filename;
		eof = false;
		currThreads = 0;

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
					pop = new Thread(new PopulateWorker());

					//Starts the new thread
					pop.start();
				}
			}

			while(currThreads != 0);
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
	/**
	*	This method is the code that each of the threads executes.
	**/
	public void run()
	{
		try
		{
            String curline = file.readLine();
			if(curline != null)
			{
				//FIXME: Need to not add repeats to the music store!
				String[] parse = curline.split(" ");
				MusicInfo m1 = new MusicInfo(parse[0], parse[1], parse[2],
					Double.parseDouble(parse[3]));

				musicStore.addSong(m1);
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
//---------------------------------------------------------------------
} // end class PopulateWorker
//---------------------------------------------------------------------
