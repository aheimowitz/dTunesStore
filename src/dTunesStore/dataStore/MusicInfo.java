//---------------------------------------------------------------------
package dTunesStore.dataStore;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
//---------------------------------------------------------------------
/**
*	This class is used to hold the information for a 
*	 single song.
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
	*	This method prints out a song's details	
	**/
	@Override public String toString()
	{
		return ("Song name: " + song_name + ", Artist name: " + 
			artist_name + ", Album name: " + album_name + 
			", Song Duration: " + 
			String.format("%.2f", duration));
	}
	
	/**
	*	This method returns the song name
	**/
	public String getSongName()
	{
		return song_name;
	}

	/**
	*	This method returns the artist's name
	**/
	public String getArtist()
	{
		return artist_name;
	}

	/**
	*	This method returns the album's name	
	**/
	public String getAlbum()
	{
		return album_name;
	}

	/**
	*	This method returns the song's duration
	**/
	public Double getDuration()
	{
		return duration;
	}

	/**
	*	This method sets the song's name 
	**/
	public void setSongName(String name)
	{
		song_name = name;
	}

	/**
	*	This method sets the artist's name
	**/
	public void setArtistName(String artist)
	{
		artist_name = artist;
	}
	
	/**
	*	This method sets the album's name
	**/
	public void setAlbumName(String album)
	{
		album_name = album;
	}

	/**
	*	This method sets the song's duration
	**/
	public void setDuration(Double dur)
	{
		duration = dur;
	}
	
} // end class MusicInfo
//---------------------------------------------------------------------
