package main.core.test;
import main.core.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
    @Test
    void createProduct(){
        Product product1 = new Product(2.20, "Coca-Cola", 1);
    }

}
