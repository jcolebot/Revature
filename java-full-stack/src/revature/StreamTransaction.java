package revature;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTransaction {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // 2011 stream
        transactions
                .stream()
                .filter(year -> year.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getYear))
                .forEach(System.out::println);
        System.out.println(); //linebreak

                // sort by city
        transactions
                        .stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .forEach(System.out::println);
        System.out.println();// linebreak

                // find traders and sort by name
                transactions
                        .stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .sorted()
                        .distinct()
                        .forEach(System.out::println);

                boolean milanTrader =
                        transactions
                                .stream()
                                .map(transaction -> transaction.getTrader())
                                .anyMatch(transaction -> transaction.getCity().equals("Milan"));
                                System.out.println(milanTrader);




    }
}
