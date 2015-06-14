package football;

import java.util.Arrays;

public class Team {
	public String teamName;
	public Player[] players;

	
	public Team(String teamName, Player[] players) {
		super();
		this.teamName = teamName;
		this.players = players;
	}

	
	public String toString() {

		String s = "\n";
		s += "Team name: " + teamName + "\n";
		s += "Players: " + Arrays.toString(players) + "\n";

		return s;
	}

}
