package main;

import java.util.ArrayList;

import lib.Player;

public class PlayerApp {

	
	/**
	 * The execute function gets the player at index 0 of the given ArrayList of type player,
	 * that player's fullname is then set to the String the user desires.
	 * 
	 * Then the function searches through all Players in the array list and formats their Name into "firstname, SURNAME",
	 * if their fullname contains the character 'a'
	 * 
	 * A string of all formatted names is then returned
	 * @param players An arraylist populated with Players
	 * @param fullName A String that the user wants to set a player's fullname to
	 * @return A string of formatted names that contain the character 'a'
	 */
	public static String execute(ArrayList<Player> players, String fullName) {
		players.get(0).setFullPlayerName(fullName);
        String returnString = "";
		
		for (Player p : players) {
		   if(p.getName().getFullName().contains("a")) {	
			returnString += p.getName().getFirstName().toLowerCase() + ", " + p.getName().getFamilyName().toUpperCase() + "\n";
		   }
		}
		
		return returnString; 
	}
	
}
