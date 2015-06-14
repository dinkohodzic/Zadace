package music;

public class Song {

	
	Artist artist;
	String songTitle;
	Integer releaseYear;
	String genre;
	
	public Song(Artist artist, String songTitle, Integer releaseYear,
			String genre) {
		super();
		this.artist = artist;
		this.songTitle = songTitle;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}
	
	public String toString(){
		String s = "";
		
		s += "Artist: " + artist + "\n";
		s += "Song title: " + songTitle + "\n";
		s += "Released: " + releaseYear + "\n";
		s += "Genre: " + genre +"\n";
		
		
		
		return s;
	}
	
	
}
