import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>(); //ArrayList that stores all the registrated products

   public void addProduct(Product product) {

        products.add(product);   ///Ändra i main där produkter registreras, det ska stå addproduct ist product.add
    }

    public Product getProduct(int id){
        for(int i = 0; i < products.size(); i++){   // gör exakt denna till products oxå
            Product p = products.get(i);
            if( p.id == id )
                return p;
        }
        return null;
    }
}







