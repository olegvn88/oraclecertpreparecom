package oracle_tasks.task0;

public class App0 {
    public static void main(String[] args) {
        int x = 0, y = 10;
        do {
            x += 2;
            System.out.println(y - x);
            y --;
        } while ( y - x > 0 );
    }
}
