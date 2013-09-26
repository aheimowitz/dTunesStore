//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
//Imported this class to make use of vectors for the songs list
import java.util.Vector;
//---------------------------------------------------------------------
public class MusicStore 
{
	//This vector is used to store all of the song information
	private Vector songs;
	private int length = 0;

	/**
	*	The empty class constructor
	**/	
	public MusicStore()
	{
		//Initializes the vector
		songs = new Vector();
	}

	/**
	*	This method adds a MusicInfo record to the 
	*	 vector of songs
	**/
	public void addSong(MusicInfo newSong, int index)
	{
		
	}

	/**
	*	This method is the "getter" method for this class
	*	 it is used to get a vector of MusicInfo 
	*	 objects at the specified index from the vector
	**/
	public Vector getSong(int index)
	{
		/*songs.elementAt(index);*/
		return songs;
		
	}

	/**
	*	This method is used to display all of the song entries 
	*	 that are in the library.
	**/
	public void displayData()
	{
		//Print all data to stdout
	/*	for(int i = 0; i < songs.capacity(); i++)	
		{
			//for(int j = 0; j < (songs.elementAt(i)).Capacity(); j++)
			{
				//System.out.println(((songs.elementAt(i)).elementAt(j)).toString());
			}*/
	}
	

} // end class MusicStore
//---------------------------------------------------------------------
