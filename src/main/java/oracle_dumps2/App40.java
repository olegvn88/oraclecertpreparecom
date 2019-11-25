package oracle_dumps2;

public class App40 {
    private void init() {
        System.out.println("initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

class Test40 {
    int a = 10;
    private static Test40 instance;

    private Test40() {
    }

    private Test40(int a) {
        this.a = a;
    }

    public static Test40 getInstance() {
        if (instance == null) {
            instance = new Test40();
        }
        return instance;
    }

    public static Test40 getInstance(int a) {
        if (instance == null) {
            instance = new Test40(a);
        }
        return instance;
    }

    public void printResult() {
        System.out.println("Result " + a);
    }
}

class Test402 {
    public static void main(String[] args) {
        Test40 test40 = Test40.getInstance();
        test40.printResult();
        test40.a = 100;
        test40.printResult();

        Test40 test401 = Test40.getInstance(200);
        test401.printResult();
    }
}
