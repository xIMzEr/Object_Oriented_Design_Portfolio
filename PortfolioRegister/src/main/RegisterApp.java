package main;

import lib.Name;
import lib.Register;

public class RegisterApp {	
	
	/**
	 * Execute removes the name of the register supplied by the user in index one, 
	 * then adds the name to the end of the list given by the user.
	 * Then the function goes through each name in the register and searches for each
	 * name in the function that has a family name bigger than or equal to 5 in length.
	 * When found the name is formatted into "FAMILY NAME, Initial(First Name) \n" then added to the
	 * string regReturn.
	 * 
	 * Once all names in the register have been searched through, the function returns regReturn
	 * @param reg the register the user wants to be modified
	 * @param n the name the user wants to add to the register
	 * @return all formatted names that have a family name bigger than or equal to 5
	 */
	public static String execute(Register reg, Name n) {	
		reg.removeName(1);
		reg.addName(n);
		String regReturn = "";
		for(Name x: reg) {
			if(x.getFamilyName().length() >= 5) {
				regReturn += x.getFamilyName().toUpperCase() + ", " + x.getFirstName().toUpperCase().charAt(0) + "\n";
			}
		}
		
		return regReturn;
	}
}