package studyOCA.softserve_dumps.dump3;

public class Question {
    public static void main(String[] args) {
        char[] src = {'j', 'e', 's', 'p', 'r', 'e', 's', 's', 'o', 'a', 'v', 'a', '7'};
        char[] dest = new char[8];
        System.arraycopy(src, 1, dest, 0, 8);
        System.out.println(new String(dest));
    }
}
