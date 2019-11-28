package studyOCA.oracle_dumps3;

public class App84 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int x = arr.length;
//        while (x > 0) {
//            x--;
//            System.out.print(arr[x] + " ");
//        }

        while (x > 0) {
            System.out.print(arr[--x] + " ");
        }
        int s = 2;
        System.out.println("\n" + arr[--s]);
    }
}
