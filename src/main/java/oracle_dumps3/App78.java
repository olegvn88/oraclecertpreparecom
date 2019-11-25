package oracle_dumps3;

public class App78 {
    public static void main(String[] args) {
        int wd = 0;
        String[] arr = {"sun", "mon", "wed", "sat"};
        for (String s : arr) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);

        int i = 10;
        int j = 20;
        int k = j += i/5;
        System.out.println( i + ":" + j + ":" + k);

    }
}


