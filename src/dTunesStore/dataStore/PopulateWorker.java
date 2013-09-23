//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
import java.util.BufferedReader;
//---------------------------------------------------------------------
public class PopulateWorker implements Runnable 
{
	private int numThreads;
	private int currThreads = 0;
    private String filename;
    private String curline;
    
    public PopulateWorker(int numThread, String name){
        numThreads = numThread;
        filename = name;
        
        boolean eof = false;
        BufferedReader file = new BufferedReader(new FileReader(filename));
        String line = "";
		while(!eof){
			if(currThreads < numThreads){
				line = file.readLine();
                if(line != null){
                    Thread pop = new Thread(new PopulateWorker(line));
                    currThreads++;
                    pop.start();
                }else{
                    eof = true;
                }
			}
		}
        file.close();
    }

	public PopulateWorker(String line)
	{
        curline = line;
	}
    
	public void run()
	{
		System.out.println(curline);
        currThreads--;

	} // end run(...)

} // end class PopulateWorker
//---------------------------------------------------------------------
