package studyOCA.oracle_tasks.task0;

public class App10 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x-- + 10); //5
        System.out.println(--x + 10); //3
        System.out.println(10 - -x);  // -3
        System.out.println(-x + 10);  // -3
        System.out.println(10 - x--); // 3
        System.out.println(10 - --x); // 1
    }
}