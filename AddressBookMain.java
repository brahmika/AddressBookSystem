//Contains the main method to take input from the user.
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBook("MyAddressBook");

        // Sample data
        addressBook.addContact(new Contact("Brahmika", "S",
                "Street1", "Chennai", "TamilNadu",
                "600001", "9876543210", "brah@example.com"));

        addressBook.addContact(new Contact("Rahul", "K",
                "Street2", "Bangalore", "Karnataka",
                "560001", "9123456780", "rahul@example.com"));

        addressBook.addContact(new Contact("Anita", "R",
                "Street3", "Delhi", "Delhi",
                "110001", "9988776655", "anita@example.com"));

        System.out.println("\nSort By:");
        System.out.println("1. City");
        System.out.println("2. State");
        System.out.println("3. Zip");

        int choice = scanner.nextInt();

        List<Contact> sortedList = null;

        switch (choice) {
            case 1:
                sortedList = addressBook.sortByCity();
                break;
            case 2:
                sortedList = addressBook.sortByState();
                break;
            case 3:
                sortedList = addressBook.sortByZip();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("\n--- Sorted Contacts ---");
        sortedList.forEach(System.out::println);

        scanner.close();
    }
}