package ex04;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void removeProduct(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    public static List<Product> listProducts() {
        return products;
    }
}
