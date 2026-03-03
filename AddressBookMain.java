//Contains the main method to take input from the user.
import java.util.Map;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        AddressBook addressBook = new AddressBook("MyAddressBook");

        // Sample Contacts
        addressBook.addContact(new Contact("Brahmika", "S",
                "Street1", "Chennai", "TamilNadu",
                "600001", "9876543210", "brah@example.com"));

        addressBook.addContact(new Contact("Rahul", "K",
                "Street2", "Chennai", "TamilNadu",
                "600002", "9123456780", "rahul@example.com"));

        addressBook.addContact(new Contact("Anita", "R",
                "Street3", "Bangalore", "Karnataka",
                "560001", "9988776655", "anita@example.com"));

        System.out.println("\n--- Count By City ---");
        Map<String, Long> cityCount = addressBook.getContactCountByCity();
        cityCount.forEach((city, count) ->
                System.out.println(city + " : " + count));

        System.out.println("\n--- Count By State ---");
        Map<String, Long> stateCount = addressBook.getContactCountByState();
        stateCount.forEach((state, count) ->
                System.out.println(state + " : " + count));
    }
}