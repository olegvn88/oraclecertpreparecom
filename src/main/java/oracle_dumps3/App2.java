package oracle_dumps3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App2 {
    public static void main(String[] args) {
        String localDateTime = LocalDate.parse("2014-05-25").format(DateTimeFormatter.ISO_DATE);
        Short s = 200;
        System.out.println(localDateTime);
    }
}