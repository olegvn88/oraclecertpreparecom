package studyOCA.softserve_dumps.dump1;

public class Question80 extends Products {

    public static void main(String[] args) {
        Question80 q = new Question80();
        q.makeCall();
        q.makeSale();
        q.smartphones();
        q.warranty();
    }

    @Override
    public void makeCall() {
        System.out.println("Make a call");
    }

    @Override
    void smartphones() {
        System.out.println("Smartphones");
    }

    @Override
    public void makeSale() {
        System.out.println("make Sale");
    }
}

interface ISales extends ICalls {
    void makeSale();
}

interface ICalls {
    void makeCall();
}
abstract class Products extends Peoples implements ISales {
    abstract void smartphones();
    public void warranty() {
        System.out.println("Products warranty");
    }
}

abstract class Peoples {

}