//Contains the main method to take input from the user.
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        boolean running = true;

        while (running) {

            System.out.println("\n1. Create Address Book");
            System.out.println("2. View All Address Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String name = scanner.nextLine();
                    system.addAddressBook(name);
                    break;

                case 2:
                    system.displayAllAddressBooks();
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}