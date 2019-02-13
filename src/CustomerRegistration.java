import java.io.Serializable;
import java.util.ArrayList;

public class CustomerRegistration implements Serializable {

    ArrayList<Customer> customers = new ArrayList<>(); //ArrayList that stores all the Customers

    public void addCustomer(Customer customer) {

        customers.add(customer);
    }

    public Customer getCustomer(int id){
        for(int i = 0; i < customers.size(); i++){
            Customer c = customers.get(i);
            if( c.id == id )
                return c;
        }
        return null;
    }

}



