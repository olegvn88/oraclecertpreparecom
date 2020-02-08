package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
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
        //Найти средний возраст среди мужчин
        OptionalDouble average = people.stream().filter(age -> age.sex.equals(Sex.MAN)).mapToInt(x -> x.age).average();
        System.out.println(average.getAsDouble());
        //Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = people.stream().filter(p -> p.age >= 18).filter(p -> (p.sex.equals(Sex.WOMAN) && p.age <= 55) ||
                (p.sex.equals(Sex.MAN) && p.age <= 60)).count();
        System.out.println(count);
    }

}