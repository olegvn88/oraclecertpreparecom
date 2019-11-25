package softserve_dumps.dump3;

import java.util.ArrayList;
import java.util.List;

public class Question18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(20);
        list.add(5);
        list.add(10);
        list.add(8);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        List list1 = new ArrayList();
        list1.add("Oleg");
        list1.add("Kate");
        list1.add("Anna");
        list1.add("Alena");
        list1.remove("Oleg");
        System.out.println(list1);
    }
}