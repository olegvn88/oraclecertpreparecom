package oracle_tasks;

import java.time.LocalDateTime;

public class App78 {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
//        System.out.println(dt(DateTimeFormatter.ISO_DATE));
    }
}
