package studyOCA.oracle_tasks.task0;

public abstract class App34 {
    public void write() {
        System.out.println("Writing...");
    }
}

class Author extends App34 {
    public void write() {
        System.out.println("Writing book");
    }
}

class Programmer extends App34 {
    public void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        App34 w = new Programmer();
        w.write();
    }
}