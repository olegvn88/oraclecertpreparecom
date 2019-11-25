package softserve_dumps.dump1;

public abstract class Question31 {
    public void write(){
        System.out.println("Writing");
    }
}

class Author extends Question31 {
    public void write(){
        System.out.println("Author");
    }
}

class Programmer extends Question31 {
    public void write() {
        super.write();
        System.out.println("Programmer");
    }

    public static void main(String[] args) {
        Question31 w = new Programmer();
        Programmer w2 = new Programmer();
        Question31 author = new Author();
        w.write();
        w2.write();
        author.write();
    }
}