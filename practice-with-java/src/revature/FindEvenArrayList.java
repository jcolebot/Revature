package revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenArrayList {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // find all even numbers from list
        for(int i = 1; i <= integers.size(); i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
