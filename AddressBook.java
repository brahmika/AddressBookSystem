//Contains methods to add and display contacts.
public class AddressBook {

    private Contact contact;  // UC1 only supports single contact

    public void addContact(Contact contact) {
        this.contact = contact;
        System.out.println("Contact Added Successfully!");
    }

    public void displayContact() {
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("No Contact Found.");
        }
    }
}