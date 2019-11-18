package lib;

/**
 * A player will always have a name as well as a PairOfDice that they can throw simultaneously,
 * then retrieve the total score from their dice throw
 * 
 * @author TB/P2405416
 *
 */
public class Player {
//
	//Fields
	private Name name;
    private PairOfDice dice;
	
    //Constructors
    /**
     * Default constructor that creates an instance of Player, using default Name and
     * PairOfDice values
     */
    public Player() {
    	name = new Name();
    	dice = new PairOfDice();
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
    public Player(Name name, PairOfDice pairOfDice) {
    	this.name = name;
    	this.dice = pairOfDice;
    }
    
    //Getters and setters
    public Name getName() {
		return name;
	}
    
	public void setName(Name name) {
		this.name = name;
	}
	public PairOfDice getDice() {
		return dice;
	}
	public void setDice(PairOfDice dice) {
		this.dice = dice;
	}
    
	//Methods
	/**
	 * Method that calls the Roll method in the PairOfDice class
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
	
	
	@Override
	public String toString() {
		return "Player:[Name= "  + name + "Die 1 = " + dice.getRed() + "Die 2 = " + dice.getBlue() + "Total Score= " + dice.getScore();
	}
	
}
