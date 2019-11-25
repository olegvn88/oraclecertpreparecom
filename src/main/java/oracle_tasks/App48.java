package oracle_tasks;

public class App48 {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        App48 obj1 = new App48();
        App48 obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + "," + var2);
        System.out.print(obj1.var + "," + obj1.var);
    }
}
