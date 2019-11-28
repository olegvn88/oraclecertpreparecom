package studyOCA.oracle_tasks;

public class App61 {
    public void test() {
        System.out.println("A");
    }
}

class B extends App61 {
    public void test() {
        System.out.println("B");
    }
}

class C extends App61 {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        App61 b1 = new App61();
        App61 b2 = new C();
        b1 = (App61) b2;
        App61 b3 = (B) b2;
        b1.test();
        b3.test();
    }
}