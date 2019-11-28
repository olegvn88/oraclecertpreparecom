package studyOCA.oracle_tasks;

public class App58 {
    public static void main(String[] args) {
        String[] names = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
            }
        } catch (Exception e) {
            System.out.println("Invalid name");
        }
        for (String p : pwd) {
            System.out.println(p);
        }
    }
}


class R {
    public static void main(String[] args) {
        String s = "EDFEDW";
        System.out.println(s.substring(2,6));
    }
}