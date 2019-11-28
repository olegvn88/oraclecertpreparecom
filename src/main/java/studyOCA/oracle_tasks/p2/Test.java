package studyOCA.oracle_tasks.p2;

import studyOCA.oracle_tasks.App23;

public class Test extends App23 {
    public Test() {
        this.getR();
        this.r = 5;
    }

    public static void main(String[] args) {

    }

    public void getV(){
        getR();
        App23 app23 = new Test();
        r = 6;
        s = 5;
        app23.s = 4;
    }
}
