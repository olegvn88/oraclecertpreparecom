package softserve_dumps.dump1;

public  abstract class Question39 {
    private String language;

    public Question39(String language) {
        this.language = language;
    }

    public void writeCode() {
        System.out.println("Written in " + language);
    }
}
