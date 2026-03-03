//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {

        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}