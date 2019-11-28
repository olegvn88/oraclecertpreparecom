package studyOCA.oracle_tasks;

public class App3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";

//        sb.append("Oleg");
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s)) {
            System.out.println("Match 2");
        } else if (sb.toString().equals("Oleg")) {
            System.out.println("Match 3");
        }
    }
}
