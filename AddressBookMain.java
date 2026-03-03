//Contains the main method to take input from the user.
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBook("MyBook");

        addressBook.addContact(new Contact("Brahmika", "S",
                "Street1", "Chennai", "TamilNadu",
                "600001", "9876543210", "brah@example.com"));

        addressBook.addContact(new Contact("Rahul", "K",
                "Street2", "Chennai", "TamilNadu",
                "600002", "9123456780", "rahul@example.com"));

        addressBook.addContact(new Contact("Anita", "R",
                "Street3", "Bangalore", "Karnataka",
                "560001", "9988776655", "anita@example.com"));

        System.out.print("Enter city to view: ");
        String city = scanner.nextLine();

        addressBook.viewPersonsByCity(city);

        scanner.close();
    }
}