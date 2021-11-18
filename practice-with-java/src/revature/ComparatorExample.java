package revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {
    public static void main(String[] args) {

        // add product details
        Product product1 = new Product(1234, "iPhone 7", 250.00);
        Product product2 = new Product(1818, "iPhone 8", 350.00);
        Product product3 = new Product(1212, "iPhone 12", 800.00);
        Product product4 = new Product(8956, "Samsung Galaxy", 849.00);
        Product product5 = new Product(1234, "Google Pixel", 699.00);

        // create list of products
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        // sort products by name
        ByName byNameComparator = new ByName();
        Collections.sort(products, byNameComparator);
        display(products);

        System.out.println(); // line break

        // sort products by price
        ByPrice byPriceComparator = new ByPrice();
        Collections.sort(products, byPriceComparator);
        display(products);

        // From java-8, FP using Lambda Expression
        //Collections.sort(products,Comparator.comparing(Product::getPrice));
    }
    private static void display(List<Product> products) {
        for(Product product:products) {
            System.out.println(product);
        }
    }
}

class ByName implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}

class ByPrice implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        return Double.compare(obj1.getPrice(), obj2.getPrice());
    }
}
