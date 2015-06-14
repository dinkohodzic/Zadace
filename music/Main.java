package music;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Initializing artists method
		Artist metallica = new Artist("Metallica", true, 1981, "Rock");

		Artist linkinPark = new Artist("Linkin Park", true, 1996, "Rock");

		Artist carlCox = new Artist("Carl Cox", false, 1980, "Electronic");

		Artist eminem = new Artist("Eminem", false, 1992, "Rap");

		Artist beyonce = new Artist("Beyonce", false, 1997, "R&B");

		Artist robbieWilliams = new Artist("Robbie Williams", false, 1990,
				"Pop");

		Artist prodigy = new Artist("The Prodigy", true, 1990, "Electronic");

		Artist bobMarley = new Artist("Bob Marley", false, 1963, "Raggae");

		Artist beethoven = new Artist("Ludwig van Beethoven", false, 1770,
				"Classic");

		Artist rhcp = new Artist("Red Hot Chilli Peppers", true, 1981, "Rock");

		// Initializing song method
		Song metallicaSong1 = new Song(metallica, "Nothing else matters", 1991,
				metallica.genre);
		Song metallicaSong2 = new Song(metallica, "Master of puppets", 1986,
				metallica.genre);

		Song linkinParkSong1 = new Song(linkinPark, "Faint", 2003,
				linkinPark.genre);
		Song linkinParkSong2 = new Song(linkinPark, "In the end", 2000,
				linkinPark.genre);

		Song carlCoxSong1 = new Song(carlCox, "I want you", 1991, carlCox.genre);
		Song carlCoxSong2 = new Song(carlCox, "Tribal jedi", 1996,
				carlCox.genre);

		Song eminemSong1 = new Song(eminem, "Loose yourself", 2003,
				eminem.genre);
		Song eminemSong2 = new Song(eminem, "Monster", 2013, eminem.genre);

		Song beyonceSong1 = new Song(beyonce, "Crazy in love", 2003,
				beyonce.genre);
		Song beyonceSong2 = new Song(beyonce, "Halo", 2008, beyonce.genre);

		Song robbieWilliamsSong1 = new Song(robbieWilliams, "Rock DJ", 2000,
				robbieWilliams.genre);
		Song robbieWilliamsSong2 = new Song(robbieWilliams, "Feel", 2012,
				robbieWilliams.genre);

		Song prodigySong1 = new Song(prodigy, "Firestarter", 1997,
				prodigy.genre);
		Song prodigySong2 = new Song(prodigy, "Omen", 2009, prodigy.genre);

		Song bobMarleySong1 = new Song(bobMarley, "I shot the sherif", 1973,
				bobMarley.genre);
		Song bobMarleySong2 = new Song(bobMarley, "Is this love", 1978,
				bobMarley.genre);

		Song beethovenSong1 = new Song(beethoven, "Symphony 9", 1824,
				beethoven.genre);
		Song beethovenSong2 = new Song(beethoven, "For Elise", 1867,
				beethoven.genre);

		Song rhcpSong1 = new Song(rhcp, "Californication", 1999, rhcp.genre);
		Song rhcpSong2 = new Song(rhcp, "Otherside", 1999, rhcp.genre);

		// Initializing song array method
		Song[] metallicaSongs = { metallicaSong1, metallicaSong2 };

		Song[] linkinParkSongs = { linkinParkSong1, linkinParkSong2 };

		Song[] carlCoxSongs = { carlCoxSong1, carlCoxSong2 };

		Song[] eminemSongs = { eminemSong1, eminemSong2 };

		Song[] beyonceSongs = { beyonceSong1, beyonceSong2 };

		Song[] robbieWilliamsSongs = { robbieWilliamsSong1, robbieWilliamsSong2 };

		Song[] prodigySongs = { prodigySong1, prodigySong2 };

		Song[] bobMarleySongs = { bobMarleySong1, bobMarleySong2 };

		Song[] beethovenSongs = { beethovenSong1, beethovenSong2 };

		Song[] rhcpSongs = { rhcpSong1, rhcpSong2 };

		// Initializing album method
		Album metallicaAlbum = new Album("Greatest hits", metallica,
				metallicaSongs, metallica.genre);

		Album linkinParkAlbum = new Album("Meteora", linkinPark,
				linkinParkSongs, linkinPark.genre);

		Album carlCoxAlbum = new Album("Second sign", carlCox, carlCoxSongs,
				carlCox.genre);

		Album eminemAlbum = new Album("Marshall Mathers LP 2", eminem,
				eminemSongs, eminem.genre);

		Album beyonceAlbum = new Album("I am... Sasha Fierce", beyonce,
				beyonceSongs, beyonce.genre);

		Album robbieWilliamsAlbum = new Album("Take the crown", robbieWilliams,
				robbieWilliamsSongs, robbieWilliams.genre);

		Album prodigyAlbum = new Album("Invaders must die", prodigy,
				prodigySongs, prodigy.genre);

		Album bobMarleyAlbum = new Album("Exodus", bobMarley, bobMarleySongs,
				bobMarley.genre);

		Album beethovenAlbum = new Album("Classic collection", beethoven,
				beethovenSongs, beethoven.genre);

		Album rhcpAlbum = new Album("Californication", rhcp, rhcpSongs,
				rhcp.genre);

		Album[] albumsRock = { metallicaAlbum, linkinParkAlbum, rhcpAlbum };
		Album[] albumMix = { carlCoxAlbum, eminemAlbum, beyonceAlbum,
				robbieWilliamsAlbum, prodigyAlbum, bobMarleyAlbum };

		Concert rockAmRing = new Concert(new Artist[3], new Song[6]);
		
		
		rockAmRing.artists[0] = metallica;
		rockAmRing.artists[1] = linkinPark;
		rockAmRing.artists[2] = rhcp;
		
		rockAmRing.songs[0] = metallicaSong1;
		rockAmRing.songs[1] = metallicaSong2;
		rockAmRing.songs[2] = linkinParkSong1;
		rockAmRing.songs[3] = linkinParkSong2;
		rockAmRing.songs[4] = rhcpSong1;
		rockAmRing.songs[5] = rhcpSong2;
		
		
		
		// System.out.println(countGenreNumber(bobMarleyAlbum,
		// bobMarley.genre));
		//printAlbumInformation(albumMix, prodigySong2);
		//System.out.println(Arrays.toString(getNumberOfSongPerAlbum(rockAmRing, albumsRock)));
	
	
	
	
	
	}

	/**
	 * <h1>Checks if two songs have the same author</h1>
	 * 
	 * @param s1
	 *            - First song
	 * @param s2
	 *            - Second song
	 * @return - true or false
	 */
	public static boolean isSameAutor(Song s1, Song s2) {

		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		}
		return false;
	}

	/**
	 * <h1>Checks if a song is from a single artist or a group</h1>
	 * 
	 * @param s
	 *            - The song
	 * @return - true or false
	 */
	public static boolean isFromSoloAutor(Song s) {
		if (s.artist.isGroup == false) {
			return true;
		}
		return false;
	}

	/**
	 * <h1>Checks if one song is older than another</h1>
	 * 
	 * @param s1
	 *            - First song
	 * @param s2
	 *            - Second song
	 * @return - The older song
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.releaseYear < s2.releaseYear) {
			return s1;
		}
		return s2;
	}

	/**
	 * <h1>Checks how many songs have entered genre</h1>
	 * 
	 * @param a
	 *            - The album
	 * @param genre
	 *            - The genre we are looking for
	 * @return - The sum of albums with the same genre
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;

		for (int i = 0; i < a.songs.length; i++) {

			if (genre.equals(genre)) {
				counter++;
			}
		}
		return counter;
	}
/**
 * <h1>Prints the album the song is on</h1>
 * This method prints the name of an album if the song is on that album, 
 * otherwise it will print null 
 * @param a The albums
 * @param s The songs
 */
	public static void printAlbumInformation(Album[] a, Song s) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				if (a[i].songs[j].equals(s)) {
					System.out.println("\n The song: " + s.songTitle
							+ " is on the album: " + a[i].albumName);
				} else if (i == a.length - 1 && j == a[i].songs.length) {

					System.out.println(s = null);
				}

			}

		}

	}
	
	/**
	 * <h1>Returns how many songs from an album appear on the concert</h1>
	 * This method returns how many songs from a specific album appear on a concert
	 * @param c The concert
	 * @param a The album
	 * @return The number of songs as an array of integers
	 */
	public static int[] getNumberOfSongPerAlbum(Concert c, Album[] a){
		int counter = 0;
		int[] array = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				counter = 1; 
				for (int k = 0; k < c.songs.length; k++) {
					if(c.songs[k].songTitle == a[i].songs[j].songTitle){
						counter++;
					}
				}
				array[i] = counter;
			}
		}
		return array;
	}
	
	
	

}
