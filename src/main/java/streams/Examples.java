package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {
}

/*
Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол),
вида Arrays.asList( new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN)).
Давайте посмотрим примеры как работать с таким классом:

 */

class People {
    String name;
    int age;
    Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

enum Sex {
    MAN, WOMAN;
}

class Task {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("Vasya", 16, Sex.MAN),
                new People("Petya", 23, Sex.MAN),
                new People("Elena", 42, Sex.WOMAN),
                new People("Alex", 26, Sex.MAN),
                new People("Ivan Ivanovich", 69, Sex.MAN));

        //Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        people.stream().filter(x -> x.sex.equals(Sex.MAN) && x.age >= 18 && x.age <= 27).map(name -> name.name).forEach(System.out::println);
        List<String> collect = people.stream().filter(x -> x.sex.equals(Sex.MAN) && x.age >= 18 && x.age <= 27).map(name -> name.name).collect(Collectors.toList());
        System.out.println(collect.toString());
    }

}