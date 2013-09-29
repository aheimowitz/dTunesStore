package dTunesStore.util;
//---------------------------------------------------------------------
import dTunesStore.dataStore.MusicInfo;
import java.util.Hashtable;
import java.util.Enumeration;
//---------------------------------------------------------------------
public class Results 
{
	Hashtable <String, MusicInfo> songList;

	/**
	*	The empty constructor for this class
	**/
	public Results()
	{
		songList = new Hashtable<String, MusicInfo>();
	}

	/**
	*	This method adds a MusicInfo record to the 
	*	 list of songs that match search terms
        @param newsong
	**/
	public void addSongFound(MusicInfo newSong)
	{
		boolean exists = false;
		//System.out.println(newSong.toString());
		//Makes an enum based on all the keys in the songList
		Enumeration keys = songList.keys();
		//Iterates through the keys and prints all entries out
		while(keys.hasMoreElements() && exists == false)
		{
			MusicInfo s1 = songList.get(keys.nextElement());
			if(newSong.getSongName().equals(s1.getSongName()) && newSong.getArtist().equals(s1.getArtist()) && 	 newSong.getAlbum().equals(s1.getAlbum()))
			{
				exists = true;
			
			}
		
		}
		if(exists == false)
		{
		
				songList.put(newSong.getSongName(), newSong);	
				/*songList.put(newSong.getArtist(), newSong);	
				songList.put(newSong.getAlbum(), newSong);*/
		}
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

}
