//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private String addressBookName;
    private List<Contact> contactList;

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
        this.contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    // UC10 – Sort by Name using Streams
    public List<Contact> sortByName() {

        return contactList.stream()
                .sorted(Comparator
                        .comparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(Contact::getLastName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
}