import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart implements Serializable {

    ArrayList<Product> products = new ArrayList<>(); //ArrayList that stores all the products

   public void addProduct(Product product) {  //Method that adds the products to arrayList products

        products.add(product);
    }

    public Product getProduct(int idProduct){       //Checks that the inscribed productID in the addProductToCustomer method is
        for(int i = 0; i < products.size(); i++){  // available by looping it through th productArrayList
            Product p = products.get(i);
            if( p.idProduct == idProduct )
                return p;
        }
        return null;
    }
}







