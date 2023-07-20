package classwork_1;

import classwork_1.products.Bottle;
import classwork_1.products.Product;
import classwork_1.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(123);

        Product product1 = new Bottle("coca-cola", 150, 1.5);
        Product product2 = new Product("milko", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

        System.out.println(vendingMachine.getProductsInfo());
    }
}