package seedu.addressbook.data.person;

public class UnitNumber{
	private String unitNumber;
	
	public UnitNumber(String unitNumber){
		this.unitNumber = unitNumber;
	}
	
	public String toString(){
		return this.unitNumber;
	}
	
	public String getUnitNumber() {
		return this.unitNumber;
	}

	public boolean equals(Object other) {  //adapted from AddressBook.java
		return other == this // short circuit if same object
				|| (other instanceof UnitNumber // instanceof handles nulls
				&& this.unitNumber.equals(((UnitNumber) other).unitNumber));
	}
}