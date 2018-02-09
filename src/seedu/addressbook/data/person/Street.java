package seedu.addressbook.data.person;

public class Street{
	private String street;
	
	public Street(String street){
		this.street = street;
	}
	
	public String toString(){
		return this.street;
	}
	
	public String getStreet() {
		return this.street;
	}

    public boolean equals(Object other) {  //adapted from AddressBook.java
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.street.equals(((Street) other).street));
    }
}