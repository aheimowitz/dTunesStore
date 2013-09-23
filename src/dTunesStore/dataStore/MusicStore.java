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

	/**
	*	The empty constructor
	**/	
	public MusicStore()
	{

		songs = new Vector();
	}

	//FIXME: Unsure if this method is needed
	public void loadStore()
	{

	}

	/*
	*	This method is used to display all of the song entries 
	*	 that are in the library.
	**/
	public void displayData()
	{
		//Print all data to stdout
		for(int i = 0; i < songs.capacity(); i++)	
		{
			/*for(int j = 0; j < (songs.elementAt(i)).capacity();
				j++)
			{
				System.out.println(((songs.elementAt(i)).elementAt(j)).toString());
			}*/
		}
	}

} // end class MusicStore
//---------------------------------------------------------------------
