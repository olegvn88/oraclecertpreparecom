package studyOCA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LearPackages {
    java.time.LocalDateTime date;
    java.sql.Date sqlDate;

    public String getDate() {
        date = LocalDateTime.now();
        return date.now().format(DateTimeFormatter.ISO_TIME);
    }
    public static void main(String[] args) {
        LearPackages l = new LearPackages();
        System.out.println(l.getDate());
    }
}
