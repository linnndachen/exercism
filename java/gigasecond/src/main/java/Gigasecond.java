import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    long gigasecond = 1000000000;
    LocalDateTime current;

    public Gigasecond(LocalDate moment) {
        current = moment.atStartOfDay();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Gigasecond(LocalDateTime moment) {
        current = moment;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {

        return current.plusSeconds(gigasecond);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
