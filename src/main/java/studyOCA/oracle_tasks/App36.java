package studyOCA.oracle_tasks;

public class App36 {
    public String name;
    public int moons;

    public App36(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        App36[] app36s = {
                new App36("Mercurey", 0),
                new App36("Venus", 0),
                new App36("Earth", 1),
                new App36("Mars", 2)
        };
        System.out.println(app36s);
        System.out.println(app36s[2]);
        System.out.println(app36s[2].moons);
    }
}