package studyOCA.oca_guide;

import java.util.function.Predicate;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(test((i) -> i == 5));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

