package studyOCA;

import java.util.ArrayList;

public class EmptyList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(24);
        list.add("efefe");
        list.add(3.5);
        list.add('v');
        System.out.println(list);
        EmptyList a = new EmptyList();
        a.checkEmptyList(list);
    }

    public void checkEmptyList(ArrayList list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }

    {
        System.out.println("new Block");
    }
}
