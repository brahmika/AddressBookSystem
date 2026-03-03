//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private String addressBookName;
    private List<Contact> contactList;

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
        this.contactList = new ArrayList<>();
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void addContact(Contact contact) {

        // 🔥 Using Java Streams to check duplicate
        boolean isDuplicate = contactList.stream()
                .anyMatch(existingContact -> existingContact.equals(contact));

        if (isDuplicate) {
            System.out.println("Duplicate Entry! Person already exists.");
        } else {
            contactList.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void displayContacts() {
        contactList.forEach(System.out::println);
    }
}