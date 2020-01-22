package ke.serialisation_example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " " + "FiveThree");
            } else if (i % 3 == 0) {
                System.out.println(i + " " + "Three");
            } else if (i % 5 == 0) {
                System.out.println(i + " " + "Five");
            } else {
                System.out.println(i);
            }
        }
    }
}