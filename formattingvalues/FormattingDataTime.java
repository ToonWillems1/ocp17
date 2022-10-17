package formattingvalues;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormattingDataTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.JULY, 26);
        LocalTime time = LocalTime.of(11,12,34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm"); //custom Date Time format
        System.out.println(dt.format(f1));

        var f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"); //the only correct format
        System.out.println(dt.format(f2));
    }
}
