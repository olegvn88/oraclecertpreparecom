package softserve_dumps.dump1;

public class ConstructorT {
    String name;
    int age;

//    public ConstructorT(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public ConstructorT(String name) {
//        this.name = name;
//    }
    public ConstructorT() {
        System.out.println("Parent");
    }
}

class Device extends ConstructorT {

    static {
        System.out.println("Static");
    }
String country;
//    public Device() {
//        System.out.println("Device");
//    }

    public Device(String name, int age) {
//        this("");
//        super();
        System.out.println();
    }

    public Device(String country) {
//        this();
        this.country = country;
    }

    public static void main(String[] args) {
        Device device = new Device("");
        System.out.println("Hello");
    }
}