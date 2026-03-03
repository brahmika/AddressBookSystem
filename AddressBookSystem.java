import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap;

    public AddressBookSystem() {
        addressBookMap = new HashMap<>();
    }

    // Add new AddressBook
    public void addAddressBook(String name) {

        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists.");
        } else {
            addressBookMap.put(name, new AddressBook(name));
            System.out.println("Address Book '" + name + "' created.");
        }
    }

    // Get AddressBook by name
    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    // UC9 – Count by City across ALL AddressBooks
    public Map<String, Long> getContactCountByCityAcrossSystem() {

        return addressBookMap.values().stream()
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .collect(Collectors.groupingBy(
                        Contact::getCity,
                        Collectors.counting()
                ));
    }

    // UC9 – Count by State across ALL AddressBooks
    public Map<String, Long> getContactCountByStateAcrossSystem() {

        return addressBookMap.values().stream()
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .collect(Collectors.groupingBy(
                        Contact::getState,
                        Collectors.counting()
                ));
    }
}