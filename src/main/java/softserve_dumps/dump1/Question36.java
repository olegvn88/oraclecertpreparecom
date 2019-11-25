package softserve_dumps.dump1;

public class Question36 {
    public static double printPerimeter(double... sides) {
        double result = 0;
        for (double side : sides) {
            result += side;
        }
        System.out.println("Perimeter is " + result);
        return 0.0;
    }

    public static void main(String[] args) {
        printPerimeter(2, 3);
        printPerimeter(new double[]{4,6,7});
        printPerimeter();
    }
}
