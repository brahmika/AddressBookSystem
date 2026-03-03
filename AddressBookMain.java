//Contains the main method to take input from the user.
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // Add Sample Contact
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName,
                "Address", "City", "State",
                "000000", "1234567890", "email@email.com");

        addressBook.addContact(contact);

        // Delete Contact
        System.out.print("\nEnter First Name to Delete: ");
        String nameToDelete = scanner.nextLine();

        addressBook.deleteContact(nameToDelete);

        // Display Remaining Contacts
        addressBook.displayContacts();

        scanner.close();
    }
}