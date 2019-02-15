import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void addProduct_CheckIfAddProductToArrayListWorks() {

        ShoppingCart shoppingCart = new ShoppingCart();

        int start = shoppingCart.products.size();
        shoppingCart.products.add(new Product("Choklad", "Godis", 20, "kr/st"));
        assertEquals(start + 1, shoppingCart.products.size());

    }
}