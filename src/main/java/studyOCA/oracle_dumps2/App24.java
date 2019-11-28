package studyOCA.oracle_dumps2;

import java.util.ArrayList;

public class App24 {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends App24 {
    public void test() {
        System.out.println("Derived A");
    }
}

class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DervedB");
    }

    public static void main(String[] args) {
        App24 b1 = new DerivedB();
        App24 b2 = new DerivedA();
        App24 b3 = new DerivedB();
        b1 = (App24) b3;
        App24 b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}

class E {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String[] arr;
        try {

            while (true) {
                list.add("My string");
            }
        } catch (RuntimeException e) {
            System.out.println("Run time exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Ready to use");
    }
}

class Str {
    public static void main(String[] args) {
        String[] st = new String[2];
        int idx = 0;
        for (String s : st) {
            st[idx].concat(" element " + idx);
            idx++;
        }
        for (int i = 0; i <st.length; i++) {
            System.out.println(st[i]);
        }

    }
}


