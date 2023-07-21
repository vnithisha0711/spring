package PhoneBookManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();


	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		this.phoneBook.add(contactObj);
		setPhoneBook(this.phoneBook);
	}
	
	public List<Contact> viewAllContacts(){
		return this.phoneBook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		Iterator itr = phoneBook.listIterator();
        while(itr.hasNext())
        {
            Object obj = itr.next();
            Contact c = (Contact)obj;
            long phone = c.getPhoneNumber();
            if(phone==phoneNumber)
            {
                return c;
            }
        }
        return null;
	}
	
	public boolean removeContact(long phoneNumber) {
		Iterator itr = phoneBook.listIterator();
        while(itr.hasNext())
        {
            Object obj = itr.next();
            Contact c = (Contact)obj;
            long phone = c.getPhoneNumber();
            if(phone==phoneNumber)
            {
            	itr.remove();
                return true;
            }
        }
        return false;
	}

}
