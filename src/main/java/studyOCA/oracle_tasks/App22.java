package studyOCA.oracle_tasks;

public class App22 {
    public static String maksCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(x);
//        return x + creditCard.substring(15,19);
        sb.append(creditCard, 15,19);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(maksCC("1234-1234-1234-7844"));
    }
}
