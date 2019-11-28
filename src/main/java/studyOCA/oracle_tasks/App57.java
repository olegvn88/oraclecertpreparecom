package studyOCA.oracle_tasks;

public class App57 {
    String type = "Canine";
    int maxSpeed = 60;

    App57() {
    }

    public App57(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class WildAnimal extends App57 {
    String bounds;

    WildAnimal(String bounds) {
        super();
        this.bounds = bounds;
    }

    public WildAnimal(String type, int maxSpeed, String bounds) {
        super(type, maxSpeed);
        this.bounds = bounds;
    }
}

class Test57 {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
    }
}
