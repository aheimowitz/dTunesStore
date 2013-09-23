//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
public class SearchWorker implements Runnable 
{
	private int numThreads;
	private String filename;

	/**
	*	This is the constructor for this class
	**/
	public SearchWorker(int numThreads, String filename) 
	{
		this.numThreads = numThreads;
		this.filename = filename;
	}

	public void run() 
	{
		// PLACEHOLDER

	} // end run(...)

} // end class SearchWorker
//---------------------------------------------------------------------
