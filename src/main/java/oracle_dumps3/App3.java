package oracle_dumps3;

public class App3 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
        long s4 = s3 * s2;
        String s = String.valueOf(s4);
        System.out.println(s);
    }
}
