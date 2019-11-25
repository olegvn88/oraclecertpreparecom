package oracle_tasks;

public class App29 {
    public static void main(String[] args) {
        String[] arr = new String[2];
        int idx = 0;
        for (String s: arr) {
            arr[idx].concat(" element " + idx);
            idx++;
        }

        for (idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
}
