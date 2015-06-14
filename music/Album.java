package music;

public class Album {

	String albumName;
	Artist artist;
	Song[] songs;
	String genre;
	public Album(String albumName, Artist artist, Song[] songs, String genre) {
		super();
		this.albumName = albumName;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}
	
	
	public String toString(){
		String s = "";
		
		s += "Album: " + albumName + "\n";
		s += "Artist: " + artist + "\n";
		s += "Genre: " + genre + "\n";

		for (int i = 0; i < songs.length; i++) {
			s += songs[i] + "\n";

		}
		return s;
		}
		
		
		
	
	
}
