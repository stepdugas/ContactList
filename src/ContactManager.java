import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {

    //Make a hashmap to store contacts (name and phone number)
    HashMap<String, String> contacts = new HashMap<>();

    //Make a scanner to get user input
    static Scanner scanner = new Scanner(System.in);


    //a main method to run the program
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("""
                    Add a Contact
                    View All Contacts
                    Search for a Contact
                    Delete a Contact
                    Exit the Program""");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Add a Contact")) {
                System.out.println("You selected: Add a Contact");
                System.out.println("Enter your contacts name: ");
                String name = scanner.nextLine();
                System.out.println("Enter the phone number for " + name);
                String phoneNumber = scanner.nextLine();
                manager.contacts.put(name, phoneNumber);
                System.out.println("Success!");

            } else if (choice.equalsIgnoreCase("View All Contacts")) {
                System.out.println("You selected: View All Contacts");
                if (manager.contacts.isEmpty()) {
                    System.out.println("No contacts found.");
                } else {
                    System.out.println("Your contacts:");
                    for (Map.Entry<String, String> entry : manager.contacts.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }

            } else if (choice.equalsIgnoreCase("Search for a Contact")) {
                System.out.println("You selected: Search for a Contact");
                System.out.println("Enter the name of the contact you would like to search for : ");
                String name = scanner.nextLine();
                if (manager.contacts.containsKey(name)) {
                    System.out.println(name + ": " + manager.contacts.get(name));
                } else {
                    System.out.println("Contact not found.");
                }


            } else if (choice.equalsIgnoreCase("Delete a Contact")) {
                System.out.println("You selected: Delete a Contact");
                System.out.println("Enter the name of the contact you want to delete : ");
                String name = scanner.nextLine();
                if (manager.contacts.containsKey(name)) {
                    manager.contacts.remove(name);
                    System.out.println(name + " has been deleted successfully.");
                } else {
                    System.out.println("Contact not found.");
                }
            }

            if (choice.equalsIgnoreCase("Exit the Program")) {
                break;
            }
        }
    }
}
