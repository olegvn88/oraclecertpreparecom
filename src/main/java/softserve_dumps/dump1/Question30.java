package softserve_dumps.dump1;

public class Question30 {

    public Question30() {
        System.out.println("Super");
    }
}


class OutputSubClass extends Question30 {

    public OutputSubClass(int x) {
        System.out.println("Sub 2");
    }

    public OutputSubClass(int x, int y) {
        System.out.println("Sub 3");
    }

    public static void main(String[] args) {
        new OutputSubClass(1, 2);
    }
}