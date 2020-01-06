package lib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 * A register contains the names of one or more people in a class. An ArrayList containing the object Name stores the names of the people
 * that are apart of the register. Names can be added, removed and returned from of a register, the size of the register can be returned as well as an
 * empty check can be used. Furthermore you can count how many people are in the register that have the same first Name and search the register by their
 * family name. The register can also be sorted if desired.
 * 
 * When the register is instantiated no names via a pre-made ArrayList can be passed through with the creation of that register. 
 * 
 * Since register contains a list of Name the relationship between both classes are Aggregation.
 * 
 * @author TB-P2405416
 */
public class Register implements Iterable<Name>{
	//Fields
	private ArrayList<Name> register;

	//Constructors
	/**
	 * Default constructor that instantiates a new ArrayList in register. 
	 * 
	 * register will currently be empty at this point and have an initial capacity of 10
	 */
	public Register() {
		register = new ArrayList<>();
	}
	
	//Getters and setters
	/**
	 * Returns the whole register
	 * @return a list of names
	 */
	public ArrayList<Name> getList() {
		return register;
	}

	/**
	 * Sets the list passed through into the instance of the object the user is referencing
	 * @param list the list passed by the user
	 */
	public void setList(ArrayList<Name> list) {
		this.register = list;
	}
	
	/**
	 * Grabs the current name in the register at a given index in the ArrayList
	 * @param index the index the user wants to search for in the Register
	 * @return the name at the index given
	 */
	public Name getName(int index) {
		return this.register.get(index);
	}
	/**
	 * Removes all names in the Register
	 */
	public void clearRegister() {
		this.register.clear();
	}
	
	/**
	 * Adds a name to the end of the Register provided by the user
	 * @param name the name passed through by the user
	 */
	public void addName(Name name) {
		this.register.add(name);
	}
	
	/**
	 * Checks to see if the register is empty
	 * @return a boolean value to say if the register is empty
	 */
	public boolean isRegisterEmpty() {
		return this.register.isEmpty();
	}
	
	/**
	 * Calls the register size function to return the size of the register
	 * @return the size of the register
	 */
	public int registerSize() {
		int regCount = 0;
		for(Name x: this.register) {
			if(x.getFullName() != null) {
				regCount++;
			}
		}
		
		return regCount;
	}

	/**
	 * Removes the name at the index the user specifies
	 * @param index the index of the name the user wants to delete
	 */
	public Name removeName(int index) {
		Name removedName = this.register.get(index);
		this.register.remove(index);
		
		return removedName;
	}
	
	/**
	 * Checks each name in the current register and compares each family name to the family
	 * name input by the user.
	 * If found return true to say that the family name is in the register
	 * @param familyName the family name the user wants to search in the register
	 * @return true or false to indicate if the family name is in the register
	 */
	public boolean searchRegisterByFamilyName(String familyName) {
        for(Name x: this.register) {
        	if(x.getFamilyName().equals(familyName)) {
        		return true;
        	}
        }
		
		return false;
		
	}
	/**
	 * Searches through each first name in the current instance of the register,
	 * then compares the user input char with the last char of each first name in the register 
	 * @param firstNameEnding the character the user wants to compare with each first name in the list with.
	 * @return a counter of how many instances that character occurs in the register per each first name.
	 */
	public int countFirstNameOccurrences(char firstNameEnding) {
		String fNEChar = Character.toString(firstNameEnding);
		int occuranceCounter = 0;
		for(Name x: this.register) {
			if(x.getFirstName().endsWith(fNEChar)) {
				occuranceCounter++;
			}
		}
		
		return occuranceCounter;
	}
	
	/**
	 * Using the imported lib Collections, the register can be sorted into ascending order by passing through the register as an arguement to
	 * the sort operation in Collections.
	 */
	public void sortRegister() {

		//Alternative method
        Collections.sort(register);
	}


	
	@Override
	/**
	 * Formats the Register object into a string displaying the states of the Register ArrayList.
	 * @return Returns a Register object as a string
	 */
	public String toString() {
        return "Register:[Register=" + register + "]";
		
	}

	@Override
	/**
	 * An Iterable interface method that delegates to theArrayList iterator()
	 * @return An iterator over all of the elements from the ArrayList in register
	 */
	public Iterator<Name> iterator() {
		return this.register.iterator();
	}


	
}
