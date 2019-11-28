package studyOCA.oracle_tasks;

import java.util.ArrayList;
import java.util.List;

public class App16 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robb");
        list.add("Bran");
        list.add("Rick");
        list.add("Bran");
        if (list.remove("Bran")) {
            list.remove("Job");
        }
        System.out.println(list);
    }
}
