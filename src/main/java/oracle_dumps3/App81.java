package oracle_dumps3;

import java.util.ArrayList;
import java.util.List;

public class App81 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.remove(2);
        list.add(3, "cyan");
        System.out.println(list);
    }
}
