package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("cat", "goose", "dog", "cow", "hen", "rabbit", "parrot");
        boolean animalExists = isContainsAnimalWithLengthOfName(animals, 5);
        long animalsCount = countAnimalsWithLengthOfName(animals, 3);
        List<String> animalsList = listAnimalsWithLengthOfName(animals, 6);
        String animal = firstAnimalStartsWith(animals, "c");
        List<String> descSortedAnimals = sortListOfAnimals(animals);

        System.out.println(descSortedAnimals);
        System.out.println(animal);
        System.out.println(animalsList);
        System.out.println(animalsCount);
        System.out.println(animalExists);
    }

    //   Выведет в консоль всех животных отсортированных по алфавиту в обратном порядке
    private static List<String> sortListOfAnimals(List<String> animals) {
        return animals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //    Найдет первое животное на букву m, если нет – бросит Exception со стектрейсом
    private static String firstAnimalStartsWith(List<String> animals, String startsWith) {
        String result = null;
        try {
            result = animals.stream().findFirst().filter(name -> name.startsWith(startsWith)).orElseThrow(() -> new Exception("Element not found"));
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
