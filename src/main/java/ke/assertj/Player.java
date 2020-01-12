package ke.assertj;

public class Player {
    String name;
    int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }


}