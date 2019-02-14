import java.io.Serializable;
import java.util.ArrayList;

public class CustomerRegistration implements Serializable {

    ArrayList<Customer> customers = new ArrayList<>();  //ArrayList that stores all the Customers

    public void addCustomer(Customer customer) {

        customers.add(customer);                      // Adds new customers to arrayList for customers
    }

    public Customer getCustomer(int id){               //Checks that the inscribed ID in addProductToCustomer method is
        for(int i = 0; i < customers.size(); i++){     // available by looping it through th customerArrayList
            Customer c = customers.get(i);
            if( c.id == id )
                return c;
        }
        return null;
    }

}



