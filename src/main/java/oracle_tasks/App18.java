package oracle_tasks;

public class App18 {
    public static String maskCC(String creditCard) {
        String x  = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15, 19);
        return sb.toString();
//return x + creditCard.substring(15, 19);
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-2356-8549"));
    }
}
