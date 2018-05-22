import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contact = new ArrayList<Contacts>();

    public void printContacts(){
        for(Contacts contct:contact){
            System.out.println(contct.getName()+"\t"+contct.getPhone_number());
        }
    }
}
