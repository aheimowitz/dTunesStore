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

	public PopulateWorker()
	{
		// This constructor is used to construct the actual 
		//  thread with the string from the file passed 
		//  as a command line argument
		this.numThreads = numThreads;
        boolean eof = false;
        //BufferedReader file;
        String line = "";
		while(!eof){
			if(currThreads < numThreads){
				//line = file.readLine();
                if(line != null){
                    Thread pop = new Thread(new PopulateWorker());
                    pop.start();
                }else{
                    eof = true;
                }
			}
		}	
	}
    
	public void run()
	{
		// This is used to run the actual thread

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
