package lib;

import java.util.ArrayList;

/**
 * A player will always have a Name as well as a Rollable type that they can throw simultaneously,
 * then retrieve the total score from their dice throw. The class contains methods for getting the Name of a 
 * player and getting the player's Rollable type. The class can also roll the player's dice and return the total score
 * of the dice/die. Furthermore the user can later set the player's name.
 * 
 * @author TB/P2405416
 *
 */
public class Player implements Comparable<Player> {
	//Fields
	private Name name;
    private Rollable dice;
	
    //Constructors
    /**
     * Default constructor that creates an instance of Player, using default Name and
     * PairOfDice values
     */
    public Player() {
    	name = new Name();
    	dice = new Die();
    }
    
    /**
     * Custom constructor that creates a new instance of Player with a set name and 
     * a default PairOfDice value is set.
     * @param name the name of the player to be provided on creation.
     */
    public Player(Name name) {
    	this.name = name;
    	dice = new PairOfDice();
    }
    
    /**
     * Customer constructor that creates a new instance of Player with a set name and
     * and set PairOfDice.
     * @param name the name of the player to be provided on creation
     * @param pairOfDice the pair of Die to be provided on creation
     */
    public Player(Name name, Rollable typeOfDice) {
    	this.name = name;
    	this.dice = typeOfDice;
    }
    
    //Getters and setters
    /**
     * Gets the current name of the player what the user wants
     * @return the name of the player
     */
    public Name getName() {
		return name;
	}
    
    /**
     * Changes the current name of the instance of the player to
     * what the user wants
     * @param name
     */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Gets the Rollable type that the player currently holds
	 * @return a Rollable type
	 */
	public Rollable getRollable() {
		return dice;
	}
	
	/**
	 * Sets the current player's dice with a rollable type passed
	 * by the user
	 * @param dice a rollable type
	 */
	public void setRollable(Rollable dice) {
		this.dice = dice;
	}
    
	//Methods
	/**
	 * Method that calls the Roll method in any of the rollable 
	 * for this instance of dice
	 */
	public void rollDice() {
		 this.dice.roll();
	}
	
	/**
	 * Method that calls the gets the combined Score of each Die using for this instance
	 * of the dice, using the getScore method from the PairOfDice class.
	 * @return returns the total score of both Die
	 */
	public int getDiceScore() {
		return this.dice.getScore();
	}
	
	/**
	 * Method that separates the String passed into the method into a FirstName and FamilyName
	 * via looking for the space between names 
	 * @param fullName the full name passed through 
	 */
	public void setFullPlayerName(String fullName) {
       String[] splitName = fullName.split(" ");
       this.name = new Name(splitName[0], splitName[1]);
	}
	
	/**
	 * Formats the player class into a string showing the states of the Name and Dice of the player
	 * @return Returns a Player object as a string
	 */
	@Override
	public String toString() {
		return "Player:["  + name + dice + "]";
	}

	/**
	 * Compare to method to implement the comparable interface into player.
	 * Compares the current instance of the player's name and compares it to the family name
	 * of the player passed by the user.
	 * 
	 * If the familyNames are the same then the two player's firstNames are compared.
	 * @param other The player the user wants to compare with the current instance of Player
	 * @return Returns 0 if the Player objects are the same; returns the difference of the two 
	 * character values at position k in the two string or if there is no index position at which they differ
	 * the compareTo returns the difference of the lengths of the strings .  
	 */
	@Override
	public int compareTo(Player other) {
		int result = this.name.getFamilyName().compareTo(other.getName().getFamilyName());
		
		if (result == 0) {
			result = this.name.getFirstName().compareTo(other.getName().getFirstName());
		}
		
		return result;
	}


	
}
