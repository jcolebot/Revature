package revature;
//Challenge is to find the second-largest number in the array without using sort method.
public class SecondLargestArrayNumber {
    public static void main(String[] args) {
//      Setting up variables for array, array length, and a temporary place holder.
        int[] numbers={10, 20, 30, 40, 50, 10};
        int size = numbers.length;
        int temp;

//      Setting up a nested loop to iterate over array and compare element values.
        for(int i = 0; i < numbers.length; i++) {
            for(int x = i  + 1; x < size; x++) {

                if(numbers[i] > numbers[x]) {
                    temp = numbers[i];
                    numbers[i] = numbers[x];
                    numbers[x] = temp;
                }

            }

        }
        System.out.println("The second largest number is: " + numbers[size - 2]);
    }
}
