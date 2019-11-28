package studyOCA.oracle_dumps3;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
//        ArrayList<Vechicle> list = new ArrayList<Vechicle>();
//        list.add(new Motorcycle());
//        list.add(new Car());

        ArrayList<Vechicle2> list2 = new ArrayList<Vechicle2>();
        list2.add(new Car2());
    }
}

interface Vechicle {

}

class Motorcycle implements Vechicle {
}

class Car implements Vechicle {
}

class Vechicle2 {
    public String printParam() {
        return "Vechicle2";
    }
}

class Car2 extends Vechicle2 {
    public String printParam() {
        return "Car2";
    }

    public String test() {
        System.out.println();
        return "";
    }
}

abstract class A implements Vechicle {
    public void calculate() {
    }
}