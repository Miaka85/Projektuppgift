import java.util.ArrayList;

public class CustomerRegistration {

    // vad ska jag ha här

    static int count = 0;                          //för att få tag på unikt id
    int id;

    Customer(){
        this.id = count++;

    }
    ArrayList<customer> customer = new ArrayList<>();{               //för att registrera kunder och varor kopplade till denne
                                                                //läs in inmatat kund info, koppla ett unikt id till. kunden till varorna i ny array?
    }
}
