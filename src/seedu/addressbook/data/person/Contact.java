package seedu.addressbook.data.person;

public class Contact {

	public String value;
	protected boolean isPrivate;

	public Contact() {
		super();
	}

	@Override
	public String toString() {
	    return value;
	}

	public boolean isPrivate() {
	    return isPrivate;
	}

}