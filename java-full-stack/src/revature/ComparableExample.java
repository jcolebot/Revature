package revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// create class to organize product info
class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // convert to string and concatenate
    @Override
    public String toString() {
        return "Product{" + "id= " + id + ", name= '" + name +
                '\'' + ", price= " + price + '}';
    }
    // set up products to be sorted by id value
    @Override
    public int compareTo(Product obj) {
        return this.id-obj.id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

public class ComparableExample {
    public static void main (String[] args) {
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

        // display products
        display(products);
        Collections.sort(products);
        System.out.println(); // line break
        display(products);

    }
    // iterates through products so they can be displayed
    private static void display(List<Product> products) {
        for(Product product:products) {
            System.out.println(product);
        }
    }
}
