package revature;

public class DisplayPractice {
    public static void main(String[] args){
        //displaying substring results
        System.out.println("Oracle".substring(1, 4)); //shows 'rac'

        // concatenation examples
        System.out.println("Hello, "+"how are you? "+"This is Java.");
        int results = 79;
        System.out.println("You scored "+results+" out of 100.");
        System.out.println("The sum of 20 and 30 is "+(20 + 30)+".");

        //escape sequences
        // use \t to print with a tab space
        System.out.println("Hello\tWorld");

        // \n prints a newline
        System.out.println("Hello\nWorld");

        //using \\ prints a single backslash
        System.out.println("Hello\\World");

        //use \" to print double quotes
        System.out.println("I am 6'2\" tall.");

        // printf give more control for displaying output i.e. shortening decimal places
        System.out.println("The answer for 5.45 divided by 3 is"+ (5.45/3)); //1.816666666667
        System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3); //1.82

        //lineSeparator() method does as the name implies
        String newline = System.lineSeparator();
        System.out.println(newline);

        //new line converter example
        System.out.printf("%d%n%d", 12, 3);

        //getProperty() method is a platform-independent line separator string
        String newline2 = System.getProperty("line.separator");
        System.out.println(newline2);

        //width flag is used to display total width
        System.out.printf("%8d", 12); //6 spaces in front of 12
        System.out.println(); //next line
        System.out.printf("%8.2f", 12.4); //3 spaces in front of first number
        System.out.println(); //next line

        //thousands separator flag(,)
        System.out.printf("%,d", 12345);

    }
}
