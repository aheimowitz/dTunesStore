//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
/**
*	This class is used to hold the information for a 
*	 single song record.
**/
//---------------------------------------------------------------------
public class MusicInfo 
{
	private String song_name;
	private String artist_name;
	private String album_name;
	private double duration;

	/**
	*	This is the basic constructor for this class
	**/
	public MusicInfo(String song_name, String artist_name, 
		String album_name, double duration)
	{
		this.song_name = song_name;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.duration = duration;
	}

	/**
	*	This method prints out a song record	
	**/
	@Override public String toString()
	{
		return ("Song name: " + song_name + ", Artist name: " + 
			artist_name + ", Album name: " + album_name + 
			", Song Duration: " + 
			String.format("%3d", duration));
	}

	public String getName()
	{
		return song_name;
	}

	public String getArtist()
	{
		return artist_name;
	}
	public String getAlbum()
	{
		return album_name;
	}

	public Double getDuration()
	{
		return duration;
	}

	public void setName(String name)
	{
		song_name = name;
	}
	public void setArtist(String artist)
	{
		artist_name = artist;
	}
	public void setAlbum(String album)
	{
		album_name = album;
	}

	public void setDuration(Double dur)
	{
		duration = dur;
	}
	
} // end class MusicInfo
//---------------------------------------------------------------------
