package studyOCA.oracle_tasks.task0;

public class App6 {
    public static void main(String[] args) {
        char[] src = { 'j', 'e', 's', 'p', 'r', 'e', 's',
         's', 'o', 'a', 'v', 'a', '7' };
         char[] dest = new char[8];
         System.arraycopy(src, 2, dest, 0, 8);
         System.out.println(new String(dest));

        int[] intArray = {10,20,30,40,50,60,70,80,90};

    }
}
