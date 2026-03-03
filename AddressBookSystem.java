import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap;

    public AddressBookSystem() {
        addressBookMap = new HashMap<>();
    }

    public List<Contact> searchByCity(String city) {

        return addressBookMap.values().stream()       // All AddressBooks
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {

        return addressBookMap.values().stream()
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }
    public void addAddressBook(String name) {
        addressBookMap.put(name, new AddressBook(name));
        System.out.println("Address Book '" + name + "' created.");
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public Map<String, AddressBook> getAddressBookMap() {
        return addressBookMap;
    }
}