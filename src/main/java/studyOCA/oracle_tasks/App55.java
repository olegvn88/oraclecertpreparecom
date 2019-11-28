package studyOCA.oracle_tasks;

import java.util.ArrayList;

public class App55 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Parent p = new Parent("Mike", 30);
        list.add(p);
        int f = list.indexOf(p);
        if (f >= 0) {
            System.out.println("Mike Found");
        }
    }
}

class Parent {
    String name;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;
}