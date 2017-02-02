package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
	public static final String POSTAL_CODE_VALIDATION_REGEX = ".+";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Unit must start with a # key and be followed by 4 digits seperated by a hyphen. i.e. #01-20";

	private String PostalCode;
	
	public PostalCode(String postalCode) throws IllegalValueException {
		if(!isValidPostalCode(postalCode)){
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}else{
		this.PostalCode=postalCode;
		}
	}
	
	public String getPostalCode(){
		return this.PostalCode;
	}
	
	private boolean isValidPostalCode(String postalCode){
		return postalCode.matches(POSTAL_CODE_VALIDATION_REGEX);
	}
}
