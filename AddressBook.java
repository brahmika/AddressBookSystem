//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void editContact(String firstName) {

        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                contact.setAddress("Updated Address");
                contact.setCity("Updated City");

                System.out.println("Contact updated successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }

    public void displayContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}