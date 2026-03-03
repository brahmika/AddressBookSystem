//Contains methods to add and display contacts.
public class AddressBook {

    private Contact contact;   // HAS-A relationship

    public void addContact(Contact contact) {
        this.contact = contact;
        System.out.println("\nContact added successfully!");
    }

    public void displayContact() {
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("No contact available.");
        }
    }
}