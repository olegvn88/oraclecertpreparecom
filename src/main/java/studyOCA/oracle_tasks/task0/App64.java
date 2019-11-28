package studyOCA.oracle_tasks.task0;

public class App64 {
    public App64() {
        System.out.println("Super");
    }
}

class OutputSubclass extends App64 {
    public OutputSubclass() {
        System.out.println("Sub 1");
    }

    public OutputSubclass(int x) {
        this();
        System.out.println("Sub 2");
    }

    public static void main(String[] args) {
OutputSubclass outputSubclass = new OutputSubclass(1);
    }
}