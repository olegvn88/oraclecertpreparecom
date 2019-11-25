package oracle_tasks;

public class App59 {
    private String name;
    private int age;
    private int salary;

    public App59(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public App59(String name, int age, int salary) {
        setSalary(salary);
//        this(name, age);
    }

    public void printDetails() {
        System.out.println(name + " " + age + " " + salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class Test59 {
    public static void main(String[] args) {
//        App59 e1 = new App59();
        App59 e2 = new App59("Jack", 50);
        App59 e3 = new App59("Jack", 50, 5000);
//        e1.printDetails();
        e2.printDetails();
        e3.printDetails();

    }
}