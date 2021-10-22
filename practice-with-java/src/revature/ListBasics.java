package revature;
import java.util.ArrayList;
import java.util.List;

public class ListBasics {
    public static void main (String[] args) {
        //create a list of adventurers
        List <String> list = new ArrayList<String>();
        list.add("Geralt of Rivia");
        list.add("Aloy");
        list.add("Nathan Drake");
        list.add("Lara Croft");
        list.add("Big Baddie");

        //display all names in list
        for(String names:list)
            System.out.println(names);

        //linebreak
        System.out.println();

        //change baddie to evil princess
        list.set(4, "Evil Princess");

        //display all names in list
        for(String names:list)
            System.out.println(names);

        //linebreak
        System.out.println();

        //remove evil princess from list
        list.remove(4);

        //display all names in list
        for(String names:list)
            System.out.println(names);
    }
}
