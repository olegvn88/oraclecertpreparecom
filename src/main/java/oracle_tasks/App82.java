package oracle_tasks;

public class App82 extends Book1 {
    public void readBook() {
        System.out.println("Read E-Book");
    }

    public static void main(String[] args) {
        Book1 book1 = new App82();
        book1.readBook();
    }

    @Override
    public void download() {
    }
}

interface Downloadable {
    public void download();
}

interface Readable1 extends Downloadable {
    public void readBook();
}

abstract class Book1 implements Readable1 {
    public void readBook() {
        System.out.println("Read book");
    }
}