package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
	public static final String BLOCK_VALIDATION_REGEX = "^[0-9]{3}[a-zA-Z]*";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Block number must begin with 3 digits and may end with a single alphabet";
	private String Block;
	
	public Block(String block) throws IllegalValueException {
		if(!isValidBlock(block)){
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}else{
		this.Block=block;
		}
	}
	public String getBlock() {
		return this.Block;
	}
	private boolean isValidBlock(String block){
		return block.matches(BLOCK_VALIDATION_REGEX);
	}
}
