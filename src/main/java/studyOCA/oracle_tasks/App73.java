package studyOCA.oracle_tasks;

public class App73 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        do {
            idx++;
        } while (idx < size - 1);

        System.out.println("The top element " + stack[idx]);
    }
}
