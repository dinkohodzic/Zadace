package music;

public class Concert {

	public Artist[] artists;
	public Song[] songs;

	public Concert(Artist[] artists, Song[] songs) {
		super();
		this.artists = artists;
		this.songs = songs;
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < artists.length; i++) {

			s += "\nArtist:\n " + artists[i] + "\n";
		}

		for (int i = 0; i < songs.length; i++) {

			s += "\nSong:\n " + songs[i] + "\n";
		}

		return s;
	}

}
