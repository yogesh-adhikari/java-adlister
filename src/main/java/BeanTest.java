import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Albums album1 = new Albums(1, "The Beattles", "John leonne", LocalDate.of(1996, 05, 01), 1000, "Rock");
        Albums album2 = new Albums(2, "Kurt cobain", "Teens Spirit", LocalDate.of(1994, 06, 10), 15000, "Rock");

        Author author1 = new Author(1, "William", "Shakespear");
        Author author2 = new Author(2, "Harry", "Potter");

        Quote quote1 = new Quote(1, "Don't Panic", author1);
        Quote quote2 = new Quote(2, "Magic", author2);

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        for (Quote quote : quotes){
            System.out.println(quote.getContent());
            System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name());
        }
    }
}
