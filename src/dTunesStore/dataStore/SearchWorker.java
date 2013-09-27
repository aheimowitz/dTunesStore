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
		/*
			FIXME: TEST CODE
		*/
		MusicInfo m1 = new MusicInfo("a", "b", "c", 1.2);
		MusicStore ms = new MusicStore();
		ms.addSong(m1);
		System.out.println(ms.getSong("c").toString());
		
		
	}

	public void run() 
	{
		// PLACEHOLDER

	} // end run(...)

} // end class SearchWorker
//---------------------------------------------------------------------
