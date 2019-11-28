package studyOCA.oracle_dumps3;

public class App83 {
    int x, y;

    public App83(int x, int y) {
        initialize(x, y);
    }

    private void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        App83 obj = new App83(x, y);
        System.out.println(x + " " + y);
        obj.getParams();
    }

    public void getParams() {
        int x = 3;
        int y = 5;
        System.out.println(x + ":" + y);
    }

}
