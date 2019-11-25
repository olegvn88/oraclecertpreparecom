package softserve_dumps.dump1;

public class Question78 {
    public static void main(String[] args) {
        String str = "Goodbye, Dog";
//        String s = str.replace("bye", "");
//        System.out.println(s);
        String s = new String("Goodbye, Dog");
        int a = s.compareTo(str);
        System.out.println(a);
    }
}
