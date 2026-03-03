//Contains methods to add and display contacts.
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        System.out.println("Contact added successfully.");
    }

    // 🔥 UC9 – Count by City using Streams
    public Map<String, Long> getContactCountByCity() {

        return contactList.stream()
                .collect(Collectors.groupingBy(
                        Contact::getCity,
                        Collectors.counting()
                ));
    }

    // 🔥 UC9 – Count by State using Streams
    public Map<String, Long> getContactCountByState() {

        return contactList.stream()
                .collect(Collectors.groupingBy(
                        Contact::getState,
                        Collectors.counting()
                ));
    }
}