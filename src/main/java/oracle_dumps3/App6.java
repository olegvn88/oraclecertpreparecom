package oracle_dumps3;

public class App6 {
    String type = "4W";
    int maxSpeed = 100;
    String name;

    public App6(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public App6(String s, String s2) {
        name = s;
        System.out.println("Super");
    }

    public App6(int a, int b, int c) {
    }

    public App6(){
        System.out.println("App6");
    }
}

class Car6 extends App6 {
    String name2;
    boolean contract;
    String trans;

    public Car6(int name) {
//       super();
        System.out.println("Subclass");
    }

    public Car6(String trans) {
//        super("","");
        super(3, 3, 3);
//        super(trans, 2);
        this.trans = trans;
    }

    public Car6(String type, int maxSpeed, String trans) {
        super("", 3);
//        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {
       new Car6(1);
    }
}

abstract class X {
    public abstract void methodFX();
}

interface Y {
    void methodFY();
}

class Z extends X implements Y {
    @Override
    public void methodFX() {

    }

    @Override
    public void methodFY() {

    }
}
