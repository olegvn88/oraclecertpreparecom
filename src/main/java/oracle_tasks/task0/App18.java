package oracle_tasks.task0;

public class App18 {
    public static void main(String[] args) {
        char[][] charArray2D = {{'c', 'u', 'p'}, {'o'}, {'f'}, {'j', 'a', 'v', 'a'}};

        System.out.println(charArray2D[1].getClass().isArray());
        System.out.println(charArray2D[1].length < 2);
        System.out.println(charArray2D.getClass().isArray());
        System.out.println(charArray2D.length > 4);
        System.out.println(charArray2D[0].length < 2);
        System.out.println(charArray2D[0].getClass().isArray());
    }
}
