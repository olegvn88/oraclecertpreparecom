package studyOCA.oracle_dumps3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App71 {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2014, 7,31, 1,1);
        ld.plusDays(30);
        System.out.println(ld.format(DateTimeFormatter.ISO_DATE));
    }
}
