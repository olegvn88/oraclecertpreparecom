package studyOCA.oracle_tasks;


public class App10 {
    public int amount;

    public App10(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changAmount(int x){
        amount += x;
    }
}

class AnotherClass {
    public static void main(String[] args) {
        App10 app10 = new App10((int)(Math.random() * 1000));
//        app10.amount = 0;
        app10.changAmount(-app10.getAmount());
        System.out.println(app10.getAmount());
    }
}
