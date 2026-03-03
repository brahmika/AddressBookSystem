import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    public void addAddressBook(String name) {

        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book with this name already exists!");
            return;
        }

        addressBookMap.put(name, new AddressBook());
        System.out.println("Address Book '" + name + "' created successfully!");
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public void displayAllAddressBooks() {
        if (addressBookMap.isEmpty()) {
            System.out.println("No Address Books available.");
            return;
        }

        System.out.println("Available Address Books:");
        for (String name : addressBookMap.keySet()) {
            System.out.println("- " + name);
        }
    }
}