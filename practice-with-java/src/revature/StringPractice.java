package revature;
//quick tip: ctrl + alt L formats code
public class StringPractice {
    // Prints Hello World
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Shows length of string
        int myLength = "Hello World".length();
        System.out.println(myLength);

        // Converts string to uppercase
        String uCase = "Hello World".toUpperCase();
        System.out.println(uCase);

        // Substring extracts string from index position 6-end
        String firstSubstring = "Hello World".substring(6);
        System.out.println(firstSubstring);

        // This substring extracts characters from index position 1-8
        String message = "Hello World";
        String secondSubstring = message.substring(1, 8);
        System.out.println(secondSubstring);

        // Displays character at index position 1
        char myChar = message.charAt(1);
        System.out.println(myChar);

        // Compares if strings are identical
        boolean equalsOrNot = "This is a string".equals("This is a string");
        System.out.println(equalsOrNot);

        // Splits string into substrings
        String names = "Jon,Michelle,Todd,Jade";
        for (String splitNames: names.split(",")) {
            System.out.println(splitNames);
        }

    }
}
