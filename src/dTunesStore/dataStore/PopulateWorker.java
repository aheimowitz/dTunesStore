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
	private int numThreads;
	private int currThreads = 0;
    private String filename;
    private String curline;
    
    public PopulateWorker(int numThread, String name){
        numThreads = numThread;
        filename = name;
        
        boolean eof = false;
        try{
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String line = "";
            while(!eof){
                Thread pop = null;
                if(currThreads < numThreads){
                    line = file.readLine();
                    if(line != null){
                        pop = new Thread(new PopulateWorker(line));
                        currThreads++;
                        pop.start();
                    }else{
                        eof = true;
                    }
                }
            }
            file.close();

        }catch(IOException e){
            System.out.println("file not found");
        }
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
