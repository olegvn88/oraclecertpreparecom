package studyOCA.oracle_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App27 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public App27(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Test2 {
    public static void checkAge(List<App27> list, Predicate<App27> predicate) {
        for (App27 app27 : list) {
            if (predicate.test(app27)) {
                System.out.println(app27.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<App27> iList = Arrays.asList(
                new App27("Hank", 45),
                new App27("Charlie", 40),
                new App27("Smith", 38));
        checkAge(iList, (App27 p) -> p.getAge() > 40 );
    }
}