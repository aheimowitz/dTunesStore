//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
import java.util.Hashtable;
import java.util.Enumeration;
//import dTunesStore.dataStore.SearchWorker;
//---------------------------------------------------------------------
public class MusicStore 
{
	Hashtable <String, MusicInfo> songList;
    private static int debug_value;

	/**
	*	The empty class constructor
	**/	
	public MusicStore()
	{
		songList = new Hashtable<String, MusicInfo>();
        Debug debugger = new Debug();
        debug_value = debugger.getValue();
        if(debug_value == 4){
            System.out.println("Constructor Called");
        }
	}

	/**
	*	This method adds a MusicInfo record to the 
	*	 list of songs
        @param newsong
	**/
	public void addSong(MusicInfo newSong)
	{
		songList.put(newSong.getSongName(), newSong);	
		songList.put(newSong.getArtist(), newSong);	
		songList.put(newSong.getAlbum(), newSong);	
	}

	/**
	*	This method gets a song from the keyword given	
        @param searchString
        @return the item from the hashtable
	**/
	public MusicInfo getSong(String searchString)
	{
		return songList.get(searchString);
		
	}

	/**
	*	This method is used to display all of the song entries 
	*	 that are in the library.
	**/
	public void displayData()
	{
		//Makes an enum based on all the keys in the songList
		Enumeration keys = songList.keys();

		//Iterates through the keys and prints all entries out
		while(keys.hasMoreElements())
		{
			System.out.println(songList.get(keys.nextElement()));
		}
	}

} // end class MusicStore
//---------------------------------------------------------------------
