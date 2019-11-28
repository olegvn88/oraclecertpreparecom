package studyOCA.oracle_tasks.task0;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(2);
        names.add("Alice");
        names.add("Ann");
        names.add("James");
        System.out.println(names.get(1).length());
    }
}
