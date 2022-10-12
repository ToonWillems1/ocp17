package intro;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DatePeriod {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        var upTo = start;
        while(upTo.isBefore(end)){
            System.out.println("give new toy: "+ upTo);
            upTo = upTo.plus(period);
        }
    }
}
