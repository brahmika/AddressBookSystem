//Contains the main method to take input from the user.
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // Add Contact
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName,
                "Old Address", "Old City", "Old State",
                "000000", "1234567890", "old@email.com");

        addressBook.addContact(contact);

        // Edit Contact
        System.out.print("\nEnter First Name to Edit: ");
        String nameToEdit = scanner.nextLine();

        addressBook.editContact(nameToEdit);

        // Display All
        addressBook.displayContacts();

        scanner.close();
    }
}