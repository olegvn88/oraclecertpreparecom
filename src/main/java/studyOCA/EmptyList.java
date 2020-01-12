package studyOCA;

import java.util.*;

public class EmptyList {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(24);
//        list.add("efefe");
//        list.add(3.5);
//        list.add('v');
//        System.out.println(list);
//        EmptyList a = new EmptyList();
//        a.checkEmptyList(list);
//        listOperations();
//        linkedListOperations();
//        mapOperations();
        setOperations();
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

    public static void listOperations() {
        System.out.println("new list");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.set(3, 100);
        list.add(4, 200);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

    }

    public static void linkedListOperations() {
        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        list.remove(9);
        list.addLast(2);
        list.removeLast();
        System.out.print(list + " ");
        System.out.println();

        for (int i = list.size() - 1; i < list.size(); i--) {
            list.removeLast();
            System.out.println(list);
        }
    }

    public static void mapOperations() {
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "He");
        System.out.println(map);
        map.put(2, null);
        map.put(4, "Oleg");
        System.out.println(map);
        System.out.println("=======");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("======");

        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

    public static void setOperations() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(6);
        Object[] x =  set.toArray();
        for (int i = 0; i < x.length; i++) {
        System.out.println(x[i]);
        }

        System.out.println(set.contains(5));

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(2);
        System.out.println(treeSet.ceiling(4));

    }
}
