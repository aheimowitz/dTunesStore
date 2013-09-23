//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
public class PopulateWorker implements Runnable 
{
	private int numThreads;
	private int currThreads = 0;

	public PopulateWorker(int numThreads, BufferedReader file)
	{
		// This constructor is used to construct the actual 
		//  thread with the string from the file passed 
		//  as a command line argument
		this.numThreads = numThreads;
		while(!eof){
			if(currThreads < numThreads){
				String line = file.readLine();
				Thread pop = new Thread(new PopulateWorker(line));
                pop.start();
			}else{
                pop.join();
            }
		}	
	}

	public void run(String line) 
	{
		// This is used to run the actual thread

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
