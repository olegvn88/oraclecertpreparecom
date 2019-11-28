package studyOCA.softserve_dumps.dump2;

public class Question38 {
    private String name;
    private String[] reqs;

    public Question38(String name, String[] reqs) {
        this.name = name;
        this.reqs = reqs;
    }

    public void post() {
    }

    private void post(char[] rawData) {

    }
}

class Programmer extends Question38 {

    public Programmer(String name, String[] reqs) {
        super(name, reqs);
    }

    public void post(String language) {
     post();
    }
}
