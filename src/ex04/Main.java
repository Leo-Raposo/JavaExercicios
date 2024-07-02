package ex04;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Choose an operation:");
            System.out.println("1 - View product list");
            System.out.println("2 - Add product");
            System.out.println("3 - Remove product");
            System.out.println("0 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    List<Product> products = ProductManager.listProducts();
                    if (products.isEmpty()) {
                        System.out.println("The product list is empty.");
                    } else {
                        System.out.println("Products:");
                        for (Product product : products) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the product price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    ProductManager.addProduct(new Product(name, price));
                    System.out.println("Product added successfully.");
                    break;

                case 3:
                    System.out.print("Enter the name of the product to be removed: ");
                    String productNameToRemove = sc.nextLine();

                    ProductManager.removeProduct(productNameToRemove);
                    System.out.println("Product removed (if it existed) successfully.");
                    break;

                case 0:
                    continueLoop = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        sc.close();
    }
}
