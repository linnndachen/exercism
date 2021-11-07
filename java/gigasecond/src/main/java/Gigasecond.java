import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Month;

public class Gigasecond {
    private static final Duration gigasecond = Duration.ofSeconds(1000000000);
    private final LocalDateTime current;

    public Gigasecond(LocalDate moment) {
        current = moment.atStartOfDay();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Gigasecond(LocalDateTime moment) {
        current = moment;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {
        LocalDateTime result = current.plusSeconds(gigasecond.getSeconds());
        return result;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    /*
    public static void main(String[] args) {
        Gigasecond test = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        System.out.println(test.getDateTime());
    }
     */

}
