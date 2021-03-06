import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();
    public static void main(String args[]){
        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit) {
            System.out.println("\t Enter your choice:-");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
            }
        }
    }

    private static void printInstructions(){
        System.out.println("\t Press");
        System.out.println("\t 0 - for instructions");
        System.out.println("\t 1 - to print list of contacts");
        System.out.println("\t 2 - to add new contact");
        System.out.println("\t 3 - update existing contact");
        System.out.println("\t 4 - remove contact");
        System.out.println("\t 5 - find contact");
        System.out.println("\t 6 - to QUIT");
    }

    static void addContact(){
        System.out.println("First enter contact name then enter number in next line");
        String name = scan.nextLine();
        String phone_number = scan.nextLine();
        phone.addContact(name,phone_number);
    }

    static void updateContact(){
        System.out.println("Enter contact name to replace");
        String old_name = scan.nextLine();
        System.out.println("Enter new contact name and phone number");
        String new_name = scan.nextLine();
        String phone_number = scan.nextLine();
        phone.updateContact(old_name,new_name,phone_number);
    }

    static void removeContact(){
        System.out.println("Enter contact name");
        String name = scan.nextLine();
        phone.removeContact(name);
    }

    static void findContact(){
        System.out.println("Enter contact name");
        String name = scan.nextLine();
        phone.findContact(name);
    }
}
