package studyOCA.oracle_tasks;

public class App24 {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends App24 {
    public void test() {
        System.out.println("DerivedA ");
    }
}

class DerivedB extends DerivedA{
    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        App24 b1 = new DerivedB();
        App24 b2 = new DerivedA();
        App24 b3 = new DerivedB();
        b1 = (App24) b3;
        DerivedA b4 = (DerivedA)b3;
        b1.test();
        b4.test();
    }
}
