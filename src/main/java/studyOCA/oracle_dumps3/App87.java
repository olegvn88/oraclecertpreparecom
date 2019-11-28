package studyOCA.oracle_dumps3;

public class App87 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);
    }
}
