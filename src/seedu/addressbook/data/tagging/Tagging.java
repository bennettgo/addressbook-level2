package seedu.addressbook.data.tagging;

import java.util.List;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	private final Person person;
	private final Tag tag;
	private final Boolean isAdding;
	
	public Tagging(Person person, Tag tag, Boolean isAdding){
		this.isAdding=isAdding;
		this.person=person;
		this.tag=tag;
	}
	
	/*
	 * Prints out the information in the association class that associates a tag and person and also indicates whether it was added 
	 * or subtracted
	 * 
	 * 
	*/
	public String toString(){
		String sign;
		if(this.isAdding){
			sign="+";
		}else{
			sign="-";
		}
		return sign + " " + this.person.getName() + " " + tag.toString();
	}
	
}
