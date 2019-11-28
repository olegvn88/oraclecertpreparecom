package studyOCA.oracle_tasks;

public class App35 {
    String name;
    int age;

    public App35(String name) {
     setName(name);
    }

    public App35(String name, int age) {
//        App35(name);
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
