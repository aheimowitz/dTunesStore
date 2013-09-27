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
    private static boolean eof = false;
    private static MusicStore musicStore;

	/**
	*	This is the initial constructor that is called from the driver
	**/
	public PopulateWorker(int numThread, String name, MusicStore store)
	{
        musicStore = store;
		numThreads = numThread;
		filename = name;
		
		try
		{
			file = new BufferedReader(new FileReader(filename));
			String line = "";
            
			while(!eof)
			{
                Thread pop = null;
				if(currThreads < numThreads)
				{
					//line = file.readLine();
					
					//Checks to ensure that the newline from the file is not empty		
					if(line != null)
					{
						//Creates a new thread with the next line from the file
						pop = new Thread(new PopulateWorker());
						currThreads++;
						//Starts a new thread
						pop.start();
					}
					else
					{
						eof = true;
					}
				}
			}

		file.close();

		}catch(IOException e){
			System.out.println("file not found");
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
		//System.out.println(counter);
        try{
            String curline = file.readLine();
            //System.out.println(curline);
            if(curline == null){
                eof = true;
            }else{
                String[] parse = curline.split(" ");
                MusicInfo m1 = new MusicInfo(parse[0], parse[1], parse[2], Double.parseDouble(parse[3]));
                musicStore.addSong(m1);
            }
            currThreads--;
        }catch (IOException e){
            System.out.println("Error");
        }

		//2) Check where to place the song in musicStore structure
		//3) Place in the musicStore structure

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
