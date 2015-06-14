package football;

public class Player {
	public String playerName;
	public int yearOfBirth;
	public String playerPosition;

	public Player(String playerName, int yearOfBirth, String playerPosition) {
		super();
		this.playerName = playerName;
		this.yearOfBirth = yearOfBirth;
		this.playerPosition = playerPosition;
	}

	
	public String toString() {

		String s = "\n";
		s += "The player's name is: " + playerName + "\n";
		s += "The player was born: " + yearOfBirth + "\n";
		s += "Plays on position: " + playerPosition + "\n";

		return s;
	}
}
