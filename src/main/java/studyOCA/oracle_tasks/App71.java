package studyOCA.oracle_tasks;

public class App71 {

}

class Test71 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        arr = new int[4];
        arr[2] = 30;
        arr[3] = 40;

        for (int x : arr) {
            System.out.print(" " + x);
        }
    }
}