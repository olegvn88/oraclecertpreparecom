package studyOCA.oracle_tasks.task0;

public class Dog extends Animal {
    @Override
    public void bark(){
        System.out.println("bark!");
    }

    public void eat(){
        System.out.println("Eat!");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.bark();
    }
}


