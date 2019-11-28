package studyOCA.oracle_tasks;

public class App4 extends Book {
    public void setBookMark() {}

    public static void main(String[] args) {
        Book book1 = new App4();
        book1.readBook();
    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook(){ }

}
