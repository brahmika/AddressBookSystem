//Contains methods to add and display contacts.
import java.util.*;

public class AddressBook {

    private String addressBookName;
    private List<Contact> contactList;

    // 🔥 Dictionary for UC8
    private Map<String, List<Contact>> cityMap;
    private Map<String, List<Contact>> stateMap;

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
        this.contactList = new ArrayList<>();
        this.cityMap = new HashMap<>();
        this.stateMap = new HashMap<>();
    }

    public void addContact(Contact contact) {

        contactList.add(contact);

        // 🔥 Add to cityMap
        cityMap.computeIfAbsent(contact.getCity(), k -> new ArrayList<>())
                .add(contact);

        // 🔥 Add to stateMap
        stateMap.computeIfAbsent(contact.getState(), k -> new ArrayList<>())
                .add(contact);

        System.out.println("Contact added successfully.");
    }

    // 🔍 View persons by City
    public void viewPersonsByCity(String city) {

        List<Contact> persons = cityMap.get(city);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No persons found in city: " + city);
        } else {
            persons.forEach(System.out::println);
        }
    }

    // 🔍 View persons by State
    public void viewPersonsByState(String state) {

        List<Contact> persons = stateMap.get(state);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No persons found in state: " + state);
        } else {
            persons.forEach(System.out::println);
        }
    }
}