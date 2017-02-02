package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
	public static final String STREET_VALIDATION_REGEX = ".+";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Street must be longer than one character";

	private String Street;
	
	public Street(String street) throws IllegalValueException {
		if(!isValidStreet(street)){
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}else{
		this.Street=street;
		}
	}
	public String getStreet() {
		return this.Street;
	}
	public boolean isValidStreet(String street){
		return street.matches(STREET_VALIDATION_REGEX);
	}
}
