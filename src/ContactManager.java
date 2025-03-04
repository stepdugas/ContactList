import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

    //Make a hashmap to store contacts (name and phone number)
    HashMap<String, String> contacts = new HashMap<>();

    //Make a scanner to get user input
    static Scanner scanner = new Scanner(System.in);


    //a main method to run the program
    public static void main(String[] args) {

       ContactManager manager = new ContactManager();

        while(true) {
            System.out.println("""
                    Add a Contact
                    View All Contacts
                    Search for a Contact
                    Delete a Contact
                    Exit the Program""");
            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("Add a Contact")) {
                System.out.println("You selected: Add a Contact");
            } else if (choice.equalsIgnoreCase("View All Contacts")) {
                System.out.println("You selected: View All Contacts");
            } else if (choice.equalsIgnoreCase("Search for a Contact")) {
            System.out.println("You selected: Search for a Contact");
            } else if (choice.equalsIgnoreCase("Delete a Contact")) {
            System.out.println("You selected: Delete a Contact");
            }

            if(choice.equalsIgnoreCase("Exit the Program")) {
                break;
            }

        }

    }



}
