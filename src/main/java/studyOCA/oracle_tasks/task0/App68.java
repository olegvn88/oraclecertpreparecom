package studyOCA.oracle_tasks.task0;

public class App68 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.insert(0, "Cat");
        sb.append("tle");
        System.out.println(sb.toString() == "Cattle");
        System.out.println(sb.toString().compareTo("Cattle"));
    }
}
