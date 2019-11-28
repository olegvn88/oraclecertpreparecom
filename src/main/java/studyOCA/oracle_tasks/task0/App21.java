package studyOCA.oracle_tasks.task0;

public class App21 {
    static class RefType {
        int val;

        RefType(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        RefType x = new RefType(1);
        RefType y = x;
        RefType z = y;
        x.val = 10;
        System.out.format("x,y,z: %d,%d,%d", x.val, y.val, z.val);
    }
}
