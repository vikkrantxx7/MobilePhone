import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contact = new ArrayList<Contacts>();

    public void printContacts(){
        if(contact.size()==0){
            System.out.println("List is empty. Kindly add contacts first.");
        }else {
            for (Contacts contct : contact) {
                System.out.println(contct.getName() + "\t->\t" + contct.getPhone_number());
            }
        }
    }

    private int searchContact(String name){
        int pos = 0;
        for(Contacts contct:contact) {
            if (contct.getName().contains(name)) {
                return pos;
            }
            pos++;
        }
        pos = -1;
        return pos;
    }

    void addContact(String name, String phone_number){
        if(searchContact(name)==-1){
            contact.add(new Contacts(name, phone_number));
            System.out.println("Contact added successfully");
            return;
        }
        System.out.println("Contact already present");
    }

    void updateContact(String old_name,String new_name,String phone_number){
        int pos = searchContact(old_name);
        if(pos==-1){
            System.out.println("Contact not present");
            return;
        }else if(searchContact(new_name)>=0){
            System.out.println("New Contact name already present");
            return;
        }
        contact.set(pos,new Contacts(new_name,phone_number));
        System.out.println("Contact updated");
    }

    void removeContact(String name){
        int pos = searchContact(name);
        if(pos>=0){
            System.out.println(contact.remove(pos).getName()+" removed");
            return;
        }
        System.out.println("Contact not present");
    }

    void findContact(String name){
        if(searchContact(name)>=0){
            System.out.println("Contact is present");
            return;
        }
        System.out.println("Contact not present");
    }
}
