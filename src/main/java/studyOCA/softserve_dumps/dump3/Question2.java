package studyOCA.softserve_dumps.dump3;

public class Question2 {
    static int modifyArray(int [] x, int y){
        return x[0] = y;
    }
    static int modifyInt(int x){
        x += 1;
        return x;
    }
    public static void main(String[] args) {
        int [] a = {15};
        int b = 10;
        modifyArray(a, b);
//        modifyInt(b);
        int c = modifyInt(5);
        System.out.println(a[0]);
//        System.out.println(b);
        System.out.println(c);

    }
}
