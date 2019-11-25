package oracle_dumps2;

public class App22 {
    public static void main(String[] args) {
        String creditCard = "1324-4566-7896-4122";
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(creditCard);
        sb.substring(15,19);
        System.out.println(x + sb);

    }
}
