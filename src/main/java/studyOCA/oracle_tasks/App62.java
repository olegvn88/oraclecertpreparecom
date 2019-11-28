package studyOCA.oracle_tasks;

public class App62 {
    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }

    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer " + (x + y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double " + (x + y));
    }

    public static void doSum(int x ,int y) {
        System.out.println("int " + (x + y));
    }
}
