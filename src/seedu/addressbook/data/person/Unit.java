package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
	public static final String UNIT_VALIDATION_REGEX = ".+";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Unit must start with a # key and be followed by 4 digits seperated by a hyphen. i.e. #01-20";

	private String Unit;
	
	public Unit(String unit)  throws IllegalValueException {
		if(!isValidUnit(unit)){
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}else{
		this.Unit=unit;
		}
	}
	
	public String getUnit(){
		return this.Unit;
	}
	public boolean isValidUnit(String unit){
		return unit.matches(UNIT_VALIDATION_REGEX);
	}
}
