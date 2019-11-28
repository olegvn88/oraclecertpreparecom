package studyOCA.oracle_tasks;

public class App15 {
    String name;
    boolean contract;
    double salary;

    public App15() {
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }

    @Override
    public String toString() {
        return name + ": " + contract + ": " + salary;
    }

    public static void main(String[] args) {
        App15 app15 = new App15();
//        app15.name = "Joe";
//        app15.contract = true;
//        app15.salary = 100;
        System.out.println(app15);

    }
}
