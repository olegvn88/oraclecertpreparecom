package studyOCA.oracle_dumps3;

public class App75 {
    public static int stVar = 100;
    public int var = 200;
    public String toString() {
        return var + ":" + stVar;
    }

    public static void main(String[] args) {
        App75 app75 = new App75();
        app75.var = 300;
        System.out.println(app75);
        App75 t2 = new App75();
        t2.stVar = 300;
        System.out.println(t2);
        App75 t3 = new App75();
        System.out.println(t3);
    }
}
