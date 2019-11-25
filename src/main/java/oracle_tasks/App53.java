package oracle_tasks;

public class App53 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Oleg");
        sb.append("Alex");
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb + " dd");
    }
}
