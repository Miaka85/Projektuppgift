import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>(); //ArrayList that stores all the registrated products

   public void addProduct(Product product) {

        products.add(product);
    }

    public Product getProduct(int idproduct){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if( p.idproduct == idproduct )
                return p;
        }
        return null;
    }
}







