package studyOCA.softserve_dumps.dump1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTasks {
    public static void main(String[] args) {
        String localDateTime = LocalDate.parse("2019-10-31").format(DateTimeFormatter.ISO_DATE);
        System.out.println(localDateTime);
    }
}
