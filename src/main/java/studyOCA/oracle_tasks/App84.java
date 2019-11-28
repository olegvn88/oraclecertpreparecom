package studyOCA.oracle_tasks;

import java.util.ArrayList;
import java.util.List;

public class App84 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.remove(2);
        System.out.println(list);
        list.add(3, "cyen");
        System.out.println(list);
    }
}
