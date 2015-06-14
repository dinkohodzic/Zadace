package football;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Initializing new players
		Player player1 = new Player("Marc-André Ter Stegen", 1992, "Goalkeeper");

		Player player2 = new Player("Gerard Piqué Bernabeu", 1987, "Defender");
		Player player3 = new Player("Javier Alejandro Mascherano", 1984,
				"Defender");
		Player player4 = new Player("Daniel Alves da Silva", 1983, "Defender");
		Player player5 = new Player("Jordi Alba Ramos", 1989, "Defender");

		Player player6 = new Player("Sergio Busquets Burgos", 1988,
				"Midfielder");
		Player player7 = new Player("Ivan Rakitic", 1988, "Midfielder");
		Player player8 = new Player("Andrés Iniesta Luján", 1984, "Midfielder");

		Player player9 = new Player("Lionel Andrés Messi", 1987, "Forward");
		Player player10 = new Player("Neymar da Silva Santos Júnior", 1992,
				"Forward");
		Player player11 = new Player("Luis Alberto Suárez Díaz", 1987,
				"Forward");

		//Initializing a new array of players
		Player[] players = new Player[] { player1, player2, player3, player4,
				player5, player6, player7, player8, player9, player10, player11 };
		
		//Initializing a new team
		Team barcelona = new Team("FC Barcelona", players);
		
		int year = 1887;

		
		int sameYear = countPlayers(barcelona, year);
		if (sameYear > 0) {
			System.out.println("In the team: " + barcelona.teamName + ", there are "
					+ sameYear + " players born in " + year + "\n");
		} else {
			System.out.println("In the team: " + barcelona.teamName
					+ " there are no players born in " + year + "\n");
		}
		
		String position = "Goalkeeper";
		System.out.println("There are " + countPlayers(barcelona, "Goalkeeper")
				+ " players playing on position " + position);
		
		System.out.println("The youngest player is: "
				+ Arrays.toString(getYoungestPlayer(barcelona))+ "\n");

	}
	/**
	 * <h1>Returns how many players are the same age</h1>
	 * This method counts how many players have the same year of birth
	 * @param t The team
	 * @param year The year
	 * @return How many players are born on the same year
	 */
	public static int countPlayers(Team t, int year) {

		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth == year) {
				counter++;
			}
		}

		return counter;
	}
	
	
	/**
	 * <h1>Checks the number of players  on the same position</h1>
	 * This method return a number that represents the number of players from one
	 * @param t The team
	 *           
	 * @param position The position
	 *            
	 * @return number of players
	 * 
	 */
	public static int countPlayers(Team t, String position) {

		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].playerPosition.equals(position)) {
				counter++;
			}
		}

		return counter;
	}
	/**
	 * <h1>Returns the youngest player in a team</h1>
	 * This method checks an array of players and returns the player with the
	 * lowest age
	 * @param t The team
	 * @return The zoungest player
	 */
	public static Player[] getYoungestPlayer(Team t) {
		int year = 0;
		int counter = 0;

		
		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth > year) {
				year = t.players[i].yearOfBirth;
			}
		}

		
		
		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth == year) {
				counter++;
			}
		}

		Player[] youngestPlayers = new Player[counter];

		
		
		counter = 0;
		for (int i = 0; i < youngestPlayers.length; i++) {

			for (int j = counter; j < t.players.length; j++) {

				if (t.players[j].yearOfBirth == year) {
					youngestPlayers[i] = t.players[j];
					counter += j + 1;
					break;
				}

			}

		}

		return youngestPlayers;

	}
}
