package oracle_dumps3;

public class App76 {
    public void displayApp76(){
        System.out.println("App76");
    }
}

interface I {
    void displayI();
}
class App762 extends App76 implements I{

    @Override
    public void displayI() {
        System.out.println("App762");
    }

    public static void main(String[] args) {
        App76 obj1 = new App762();
        I obj2 = new App762();

//        App76 s = obj2;
//        I t = obj1;

    }
}