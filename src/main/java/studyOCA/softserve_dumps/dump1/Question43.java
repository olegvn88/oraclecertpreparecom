package studyOCA.softserve_dumps.dump1;

public class Question43 {
    public int i1;
    public static int i2;

    public static void main(String[] args) {
        Question43 v1 = new Question43();
        Question43 v2 = new Question43();
        v1.i2 = 10;

        v2.i2 = 5;
        System.out.format("%d + %d = %d", v1.i2, v2.i2, v1.i2 + v2.i2);
        System.out.println();
        StringBuilder sb = new StringBuilder("DataDataDataDataData");
//        sb.append("DataDataDataDataData");
//        sb.append("aaaa");
        System.out.println(sb.length());
        sb.delete(0, sb.length());
        System.out.println(sb.capacity());
    }
}
