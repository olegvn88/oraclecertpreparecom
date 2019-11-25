package oracle_dumps3;

import java.util.ArrayList;

public class App25 {
    public static void main(String[] args) {
        if(args[0].equals("HELLO") ? false : true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}

class D22 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(null);
        list.add(4);
        list.remove(2);
        list.remove(null);
        System.out.println(list);
    }
}