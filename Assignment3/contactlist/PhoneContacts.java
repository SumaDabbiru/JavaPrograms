package Assignment3.contactlist;
	
	public class PhoneContacts {

		public static void main(String[] args) {
			ContactList contactsList = new ContactList();
			
			contactsList.addContact("Ab", 34567);
			contactsList.addContact("Bee", 12345);
			contactsList.addContact("Cee", 67890);
					
			System.out.println("Ab: " + contactsList.searchName("Ab"));
			System.out.println("67890: " + contactsList.searchNumber(67890));
			
			System.out.println();
			contactsList.listAllContacts();
		}

	}
