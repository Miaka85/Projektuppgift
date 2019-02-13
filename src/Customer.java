import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {   //Customer class, implement Serializable for the saving

    private String name;  // Field with the instance variables for customers
    private String city;
    static int count = 1;
    int id;

    ArrayList<Product> customerCart = new ArrayList<>(); //ArrayList that stores products to the customers


    public Customer(String name, String city){  // constructor that gives the right value.
            this.name = name;                   //using "this" to point at the instance variables
            this.city = city;
            this.id = count++;                  //This count++ gives the customer a individual id
        }


    public void setName(String newName){  // Setters and Getters
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String newCity){
        this.city = newCity;
    }
    public String getCity() {
        return this.city;
    }

    public void setId(int newId){
        this.id =newId;
    }
    public int getId(){

        return this.id;
    }

    @Override
    public String toString() {                           //toString method that gives us a nice printing
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                '}';
    }
}




