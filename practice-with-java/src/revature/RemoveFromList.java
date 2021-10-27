package revature;

import java.util.ArrayList;
import java.util.List;
// goal is to remove nonveg items from menu
public class RemoveFromList {
    public static void main(String[] args) {
        // create list of items
        List<String> menu = new ArrayList<>();
        menu.add("Veg");
        menu.add("NonVeg");
        menu.add("Veg");
        menu.add("NonVeg");
        menu.add("Veg");
        menu.add("NonVeg");
        System.out.println(menu);

        // replace nonveg items with out of stock message
        menu.replaceAll(menuItem -> menuItem.equals("NonVeg")?"Out of stock": menuItem);
        System.out.println((menu));

        // remove out of stock items from menu using lambda expression
        menu.removeIf(menuItem -> menuItem.equals("Out of stock"));
        System.out.println(menu);


        // removing items with remove method
//        boolean removeNonVeg1 = menu.remove("NonVeg");
//        boolean removeNonVeg2 = menu.remove("NonVeg");
//        boolean removeNonVeg3 = menu.remove("NonVeg");
    }
}
