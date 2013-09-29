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
	private static int currThreads = 0;
	private static BufferedReader file;
	private String filename;
	private static boolean eof;
	private static MusicStore musicStore;

	/**
	*	This is the initial constructor that is called from the driver
	**/
	public PopulateWorker(int numThread, String name, MusicStore store)
	{
		musicStore = store;
		numThreads = numThread;
		filename = name;
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
					//Spawns a new thread
					pop = new Thread(new PopulateWorker());
				
					//Adds one to the currently running threads counter
					currThreads++;

					//Starts the new thread
					pop.start();
				}
			}

			file.close();

		}
		catch(IOException e)
		{
			System.out.println("ERROR: file not found!");
			System.exit(1);
		}
	}

	/**
	*	This is the constructor that is called for each of the threads
	*	 from the constructor above
	**/
	private PopulateWorker()
	{

	}

	/**
	*	This method is the code that each of the threads executes
	**/
	public void run()
	{
		try
		{
			String curline = file.readLine();
			if(curline == null)
			{
				eof = true;
			}
			else
			{
				String[] parse = curline.split(" ");
				MusicInfo m1 = new MusicInfo(parse[0], parse[1], parse[2], 
				Double.parseDouble(parse[3]));
				musicStore.addSong(m1);
			}
			currThreads--;
		}
		catch (IOException e)
		{
			System.out.println("Error");
		}

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
