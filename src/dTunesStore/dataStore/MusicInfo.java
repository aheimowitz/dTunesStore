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
    private static int debug_value;

	/**
	*	This is the basic constructor for this class
        @param song_name, artisit_name
	**/
	public MusicInfo(String song_name, String artist_name, 
		String album_name, double duration)
	{
        Debug debugger = new Debug();
        debug_value = debugger.getValue();
        if(debug_value == 4){
            System.out.println("Constructor Called");
        }
		this.song_name = song_name;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.duration = duration;
	}

	/**
	*	This method prints out a song's details	
        @return the type put to a string
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
        @return song_name
	**/
	public String getSongName()
	{
		return song_name;
	}

	/**
	*	This method returns the artist's name
        @return artist_name
	**/
	public String getArtist()
	{
		return artist_name;
	}

	/**
	*	This method returns the album's name	
        @return album_name
	**/
	public String getAlbum()
	{
		return album_name;
	}

	/**
	*	This method returns the song's duration
        @return duration
	**/
	public Double getDuration()
	{
		return duration;
	}

	/**
	*	This method sets the song's name 
        @param name
	**/
	public void setSongName(String name)
	{
		song_name = name;
	}

	/**
	*	This method sets the artist's name
        @param artist
	**/
	public void setArtistName(String artist)
	{
		artist_name = artist;
	}
	
	/**
	*	This method sets the album's name
        @param album
	**/
	public void setAlbumName(String album)
	{
		album_name = album;
	}

	/**
	*	This method sets the song's duration
        @param dur
	**/
	public void setDuration(Double dur)
	{
		duration = dur;
	}
	
} // end class MusicInfo
//---------------------------------------------------------------------
