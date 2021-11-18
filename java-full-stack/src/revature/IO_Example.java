package revature;

import java.io.*;

public class IO_Example {
    public static void main(String[] args) {
        File reportFile = new File("practice-with-java/src/revature/report");
        try(
                FileReader fileReader = new FileReader(reportFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                //PrintWriter printer = new PrintWriter("New Report");
                ) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
               String[] arr = line.split(",");
               for(String str : arr) {
                   System.out.println(str);
               }
                //printer.println(arr);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
