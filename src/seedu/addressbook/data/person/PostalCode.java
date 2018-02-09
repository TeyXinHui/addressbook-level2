package seedu.addressbook.data.person;

public class PostalCode{
	private String postalCode;
	
	public PostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String toString(){
		return this.postalCode;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}

    public boolean equals(Object other) {  //adapted from AddressBook.java
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.postalCode.equals(((PostalCode) other).postalCode));
    }
}