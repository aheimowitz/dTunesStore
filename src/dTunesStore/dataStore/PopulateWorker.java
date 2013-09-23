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

	public PopulateWorker(int numThreads) 
	{
		// This constructor is used to construct the actual 
		//  thread with the string from the file passed 
		//  as a command line argument
		
		this.numThreads = numThreads;
		while(!eof){
			if(curThreads < numThreads){
				//read next line
				//create thread
				//run thread pass line in
			}
		}	
	}

	public void run(String line) 
	{
		// This is used to run the actual thread

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
