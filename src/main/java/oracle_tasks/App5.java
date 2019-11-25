package oracle_tasks;

public class App5 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        System.out.println(ta);
        ta = ta.concat(tb);
        System.out.println(ta);

        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace('s', 'b'));

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace('o', 'a'));
    }
}
