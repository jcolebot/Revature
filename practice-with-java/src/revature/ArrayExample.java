package revature;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // create a new array
        int[] userAge;
        userAge = new int[] {20, 30, 40, 50, 60};

        // change element 0 to 31
        userAge[0] = 31;

        // declaring and initializing array in one statement
        int[] userAge2 = {18, 19, 20, 21, 22};

        // adding 20 to third element
        userAge2[2] = userAge2[2] + 20;

        // sets array to hold 10 elements cannot be expanded in Java
        int[] userAge3 = new int[10];

        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        int[] arr3 = {10, 8, 6, 4, 2, 0};

        // equals() method compares if arrays have the same number of elements and are arranged in the same order
        boolean result1 = Arrays.equals(arr1, arr2); //true
        boolean result2 = Arrays.equals(arr1, arr3); //false

        // copyOfRange() method copies content of one array to another and requires 3 arguments
        int[] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source,3,7); // copies index 3-6

        // toString() method returns a string of the contents of an array.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // sort() method arranges array values in ascending order
        int[] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // binarySearch() method allows you to search for a specific value in a sorted array
        int[] myInt = {21, 23, 34, 45, 56, 78, 99};

        //finds 78 at index 5
        int foundIndex = Arrays.binarySearch(myInt, 78);

        //returns -4 (- means not found, 4 is the index value if it existed)
        int foundIndex2 = Arrays.binarySearch(myInt, 39);
    }
}
