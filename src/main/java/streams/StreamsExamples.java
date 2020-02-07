package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("cat", "goose", "dog", "cow", "hen", "rabbit", "parrot", "carrot");
        boolean animalExists = isContainsAnimalWithLengthOfName(animals, 5);
        long animalsCount = countAnimalsWithLengthOfName(animals, 3);
        List<String> animalsList = listAnimalsWithLengthOfName(animals, 6);
        String animal = firstAnimalStartsWith(animals, "p");
        List<String> descSortedAnimals = sortListOfAnimals(animals);

        System.out.println(descSortedAnimals);
        System.out.println(animal);
        System.out.println(animalsList);
        System.out.println(animalsCount);
        System.out.println(animalExists);

        System.out.println(animals.stream().anyMatch(nameLength -> nameLength.length() == 5));
        System.out.println(animals.stream().filter(nameLength -> nameLength.length() == 3).count());
        System.out.println(animals.stream().filter(name -> name.length() == 6).collect(Collectors.toList()));

        animals.stream().filter(name -> name.contains("o")).forEach(System.out::println);
        System.out.println("===========");
        List<String> o = animals.stream().filter(name -> name.contains("c")).collect(Collectors.toList());
        System.out.println(o.stream().filter(o.get(3)::equals).collect(Collectors.toList()));
    }

    //   Выведет в консоль всех животных отсортированных по алфавиту в обратном порядке0
    private static List<String> sortListOfAnimals(List<String> animals) {
        return animals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //    Найдет первое животное на букву m, если нет – бросит Exception со стектрейсом
    private static String firstAnimalStartsWith(List<String> animals, String startsWith) {
        String result = null;
        try {
            result = animals.stream().filter(name -> name.startsWith(startsWith)).findFirst().orElseThrow(() -> new Exception("Element not found"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //    Вернет всех животных из 6 букв в виде List
    private static List<String> listAnimalsWithLengthOfName(List<String> animals, int lengthOfName) {
        return animals.stream().filter(nameLength -> nameLength.length() == lengthOfName).collect(Collectors.toList());
    }

    //   Вернет количество животных из 3 букв
    private static long countAnimalsWithLengthOfName(List<String> animals, int lengthOfName) {
        return animals.stream().filter(lenghtName -> lenghtName.length() == lengthOfName).count();
    }

    //   Вернет Boolean есть ли в списке животные из 5 букв
    private static boolean isContainsAnimalWithLengthOfName(List<String> animals, int lengthOfName) {
        return animals.stream().anyMatch(name -> name.length() == lengthOfName);
    }
}

//содержит ли - stream().anyMatch().
//проверить условие и вернуть list - stream().filter(name -> name.length == 5).collect(Collectors.toList())
//первое совпадение или выбросить исключение - stream().filter(name -> name.startWith("p")).findFirst().ofElseThrow(() -> new Exception))
//отсортировать список в обратном порядке - list.stream().sorted(Comparator.reverseOrder()).collect(Collector.toList())
//отфильтровать и вернуть список -
//отфильтровать И вывести на экран спико -

/*
"a3"::equals~

        boolean func(s){
        return "a3".equals(s);
        }

 а(s)->s.contains("1")~

        boolean func(s){
        return s.contains("1");

}*/
