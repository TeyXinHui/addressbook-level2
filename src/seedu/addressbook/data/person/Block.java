package seedu.addressbook.data.person;

import seedu.addressbook.data.AddressBook;

public class Block{
	private String block;
	
	public Block(String block){
		this.block = block;
	}
	
	public String toString(){
		return this.block;
	}
	
	public String getBlock() {
		return this.block;
	}

    public boolean equals(Object other) {  //adapted from AddressBook.java
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.block.equals(((Block) other).block));
    }
}