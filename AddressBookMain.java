//Contains the main method to take input from the user.
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        // Create multiple AddressBooks
        system.addAddressBook("Home");
        system.addAddressBook("Office");

        // Add sample data (for testing)
        AddressBook home = system.getAddressBook("Home");
        home.addContact(new Contact("Brahmika", "S", "Street1",
                "Chennai", "TamilNadu", "600001",
                "9876543210", "brah@example.com"));

        AddressBook office = system.getAddressBook("Office");
        office.addContact(new Contact("Rahul", "K", "Street2",
                "Chennai", "TamilNadu", "600002",
                "9123456780", "rahul@example.com"));

        // 🔍 Search by City
        System.out.print("Enter City to Search: ");
        String city = scanner.nextLine();

        List<Contact> cityResults = system.searchByCity(city);

        System.out.println("Search Results:");
        cityResults.forEach(System.out::println);

        scanner.close();
    }
}