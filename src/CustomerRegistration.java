import java.util.ArrayList;
import java.util.Scanner;

public class CustomerRegistration {
    /*
    void newCustomer(){
        kundId = anropa metod som ger id
    }
    static int count = 0;                          //för att få tag på unikt id
    int id;

    Customer(){
        this.id = count++;
    }
    ArrayList<customer> customer = new ArrayList<>();{    */           //för att registrera kunder och varor kopplade till denne
                                                                //läs in inmatat kund info, koppla ett unikt id till. kunden till varorna i ny array?
   // }
//}


    public void addCustomer(Customer customer) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Enter your City: ");
        String city = input.nextLine();

        Customer cus = new Customer(name, city,);

        System.out.print(cus.getName());

        List<Customer> customer = new ArrayList<Customer>();

        customer.add(cus);

        // Output the list contents
        printList(customer);

    }

    public static void printList(List<Customer> list) {

        System.out.println("Customers: ");

        for (Customer customer : list) {
            System.out.printf("%s", customer);
        }
        System.out.println();
    }
}