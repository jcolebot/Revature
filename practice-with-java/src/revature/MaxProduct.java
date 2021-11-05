package revature;

import java.util.Arrays;

public class MaxProduct {
    // nested loop method
    public static int maximumProduct(int[] arr) {

        int max = Integer.MIN_VALUE;

        if(arr.length < 2) {
            System.out.println("No maximum exist.");
            return max; // returning sentinel value
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                }
            }
        }
        return max;
    }
    // sort method
    public static int maximumProduct2(int[] arr) {

        if(arr.length < 2) {
            System.out.println("No maximum exist.");
            return Integer.MIN_VALUE;
        }

        Arrays.sort(arr);

        int maxProduct = arr[arr.length-2] * arr[arr.length -1];
        int minProduct = arr[0] * arr[1];

        if(maxProduct > minProduct) {
            return maxProduct;
        }
        else {
            return minProduct;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] arr2 = {-6, 7, -1, 0, 8};

        System.out.println(maximumProduct(arr));
        System.out.println(maximumProduct(arr2));

        System.out.println(maximumProduct2(arr));
        System.out.println(maximumProduct2(arr2));
    }
}
