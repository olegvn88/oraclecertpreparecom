package studyOCA.oracle_tasks;

import java.util.ArrayList;

public class App70 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(null);
        list.remove(2);
        list.remove(null);
        System.out.println(list);
    }
}
