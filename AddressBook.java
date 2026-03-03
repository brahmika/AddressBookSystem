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

    // Sort by City
    public List<Contact> sortByCity() {

        return contactList.stream()
                .sorted(Comparator.comparing(
                        Contact::getCity,
                        String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Sort by State
    public List<Contact> sortByState() {

        return contactList.stream()
                .sorted(Comparator.comparing(
                        Contact::getState,
                        String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Sort by Zip
    public List<Contact> sortByZip() {

        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .collect(Collectors.toList());
    }
}