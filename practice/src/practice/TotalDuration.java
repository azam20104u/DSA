package practice;
import java.time.Duration;
import java.time.LocalTime;

public class TotalDuration {
    public static void main(String[] args) {
        LocalTime swipeIn1 = LocalTime.of(9, 0);
        LocalTime swipeOut1 = LocalTime.of(11, 0);
        LocalTime swipeIn2 = LocalTime.of(12, 0);
        LocalTime swipeOut2 = LocalTime.of(17, 0);
        LocalTime swipeIn3 = LocalTime.of(17, 30);
        LocalTime swipeOut3 = LocalTime.of(19, 0);

        Duration d1 = Duration.between(swipeIn1, swipeOut1);
        Duration d2 = Duration.between(swipeIn2, swipeOut2);
        Duration d3 = Duration.between(swipeIn3, swipeOut3);

        Duration total = d1.plus(d2).plus(d3);
        System.out.println(total.toHours() + " hours, " + total.toMinutesPart() + " minutes, " + total.toSecondsPart() + " seconds");
    }
}
