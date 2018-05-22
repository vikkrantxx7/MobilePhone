import java.util.*;

public class Main {
    public static void main(String args[]){

        boolean quit = false;
        int choice;
        Scanner scan = new Scanner(System.in);
        while(!quit) {
            choice = scan.nextInt();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:

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
        System.out.println("\t 5 - to QUIT");
    }
}
