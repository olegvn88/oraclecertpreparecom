package softserve_dumps.dump1;

public class Looping {
    public static void main(String[] args) {
        for (int x = 0; x < 6; x -= 2) {
            System.out.println("Outer х " + x);
            System.out.print("inner: x");
            while (x++ < 7)
                System.out.print(" " + x);
            System.out.println("\nOuter x:" + x);
        }
    }
}
