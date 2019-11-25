package oracle_tasks.task0;

public class App7 {
    int i1;
    static int i3;
    public static void main (String[] args) {
        App7 scope = new App7();
        scope.printVar(); //line 1
//        int i2 = i1; //line 2
//        int i3 = i2; //line 3
    }

    private void printVar() {
        System.out.println(i1); //line 4
    }
}
