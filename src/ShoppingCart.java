public class ShoppingCart {

Customer customer;
ArrayList<Product> products = new ArrayList<Product>();

    ShoppingCart(Customer customer){
    this.customer = customer;
}

public void addProduct(Product product){
        products.add(product);
}

public ArrayList<Product> getProducts(){
        return products;
}



}
