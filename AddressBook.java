//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void deleteContact(String firstName) {

        Iterator<Contact> iterator = contactList.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                iterator.remove();   // Safe removal
                System.out.println("Contact deleted successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }
}