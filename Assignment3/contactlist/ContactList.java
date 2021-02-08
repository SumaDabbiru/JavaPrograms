package Assignment3.contactlist;

import java.util.*;
import java.util.Map.Entry;

public class ContactList{
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public boolean searchName(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean searchNumber(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			//System.out.println(me.getValue() + " == " + number + " :: " + (me.getValue() == number));
			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}
	}
}
