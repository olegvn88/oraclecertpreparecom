package studyOCA.oracle_tasks;

public class App17 {
    public App17() {
        System.out.print("A");
    }
}

class B17 extends App17 {
    public B17(String s) {
        System.out.print("B");
    }
}

class C17 extends B17 {
    public C17() {
        super("");
        System.out.print("C");
    }

    public static void main(String[] args) {
        C17 c17 = new C17();

    }
}
