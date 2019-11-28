package studyOCA.oracle_tasks;

public class App31 {
    String msg;
    App31(String msg) {
        this.msg = msg;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new App31("Java SE 8"));
//Result: //Hello Java SE 8
          //Hello studyOCA.oracle_tasks.App31@3f0ee7cb
    }
}