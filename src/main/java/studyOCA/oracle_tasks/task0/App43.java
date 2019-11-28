package studyOCA.oracle_tasks.task0;

public class App43 {
    public String toString() {
        return "Super String";
    }
    public Object toString(String str) {
        return "Super " + str;
    }

    public static void main(String[] args) {
        System.out.println(new App43().toString("String"));
        System.out.println((Object) new App43().toString());
    }
}
class SubString extends App43 {
    public String toString() {
        return "Sub String";
    }
    public String toString(String str) {
        return "Sub " + str;
    }
}
