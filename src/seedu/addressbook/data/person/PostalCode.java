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
}