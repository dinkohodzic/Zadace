package music;

public class Artist {

	String name;
	Boolean isGroup;
	Integer yearOfFoundation;
	String genre;

	public Artist(String name, Boolean isGroup, Integer yearOfFoundation,
			String genre) {
		super();
		this.name = name;
		this.isGroup = isGroup;
		this.yearOfFoundation = yearOfFoundation;
		this.genre = genre;
	}

	public String toString(){
		String s = "";
		
		s += "Artist: " + name + "\n";
		s += "Group?: " + isGroup + "\n";
		s += "Genre: " + genre + "\n";
		s += "Year of foundation: " + yearOfFoundation +"\n";
		
		
		
		return s;
	}
	
}
