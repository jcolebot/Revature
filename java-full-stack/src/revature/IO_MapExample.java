package revature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IO_MapExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("practice-with-java/src/revature/report"));
        Map<String, Double> map = new HashMap<>();

        // imperative style solution
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] tokens = line.split(",");
            String department = tokens[1];
            double salary = Double.parseDouble(tokens[2]);
            if (map.containsKey(department)) {
                double newTotal = map.get(department) + salary;
                map.put(department, newTotal);
            }
            else {
                map.put(department, salary);
            }
        }
        // declarative style solution
//       Map<String, DoubleSummaryStatistics> map = Files.lines(Paths.get("practice-with-java/src/revature/report"))
//                        .map(line -> line.split(",")).collect(Collectors.groupingBy(tokens -> tokens[1],
//                        Collectors.summarizingDouble(tokens -> Double.parseDouble(tokens[2]))));

        System.out.println(map);
        scanner.close();
    }
}
