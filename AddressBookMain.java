//Contains the main method to take input from the user.
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBook("MyAddressBook");

        // Add multiple persons using console
        System.out.print("How many contacts do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {

            System.out.println("\nEnter details for Contact " + (i + 1));

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Zip: ");
            String zip = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            addressBook.addContact(new Contact(
                    firstName, lastName, address,
                    city, state, zip, phone, email));
        }

        // Sort and Display
        System.out.println("\n--- Contacts Sorted Alphabetically ---");

        List<Contact> sortedContacts = addressBook.sortByName();

        sortedContacts.forEach(System.out::println);

        scanner.close();
    }
}