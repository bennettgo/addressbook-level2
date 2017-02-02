package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String[] decodedAddress = decodeAddress(address);
        this.isPrivate = isPrivate;
        setAddress(decodedAddress);
    }

    private String[] decodeAddress(String address){
    	return address.split(", ");
    }
    
    private void setAddress(String[] decodedAddress) throws IllegalValueException{
    	this.block=new Block(decodedAddress[0]);
    	this.street=new Street(decodedAddress[1]);
    	this.unit=new Unit(decodedAddress[2]);
    	this.postalCode=new PostalCode(decodedAddress[3]);
    }

    @Override
    public String toString() {
        return this.block + ", " + this.street + ", " + this.unit + ", " + this.postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
