package lib;

/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name implements Comparable<Name> {

	//Fields
	private String firstName;
	private String familyName;
	
	
	//Constructors
	/**
	 * Default constructor that takes no arguements and populates the firstName and
	 * familyName with empty fields
	 */
	public Name() {
		firstName = "";
		familyName = "";
	}
	
	/**
	 * Custom Constructor that populates the current instance of Name with a firstName and family name
	 * passed by the user
	 * @firstName The first name of the Name passed by the user
	 * @familyName The last/family name of the Name passed by the user
	 */
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	
	//Methods
	/**
	 * Instantiates the firstName of the current user with the firstName passed
	 * by the user
	 * @firstName the first name of the current Name passed by the user
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Instantiates the firstName of the current user with the firstName passed
	 * by the user
	 * @familyName the last/family name of the current Name passed by the user
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFullName() {
		if (firstName.equals("") && familyName.equals("")) {
			return "";
		} else {
			return firstName + " " + familyName;
		}
	}
	
	@Override
	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// test exceptional cases, i.e. obj not null and is a Name
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Name other = (Name) obj; // downcast to a Name object

		// compare first & family names using String's .equals() method
		return this.familyName.equals(other.familyName)
			&& this.firstName.equals(other.firstName);
	}
	
	@Override
	public int compareTo(Name other) {
		int result = this.familyName.compareTo(other.familyName);
		
		if (result == 0) {
			result = this.firstName.compareTo(other.firstName);
		}
		
		return result;
	}
}
