package streams;

/*
     Integer sumOddOld = 0;
        for(Integer i: collection) {
            if(i % 2 != 0) {
                sumOddOld += i;
            }
        }
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 8, 9, 7, 5, 3, 9, 4, 7, 5, 4, 756, 34, 76, 546, 23, 11, 55, 66, 98);
//        List<Integer> list = Arrays.asList(44, 4, 54, 24, 54);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        Integer integer = collect.stream().reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(integer);

        //Получение коллекции без дубликатов из упорядоченного стрима
        List<Integer> collect1 = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(collect1);

        //Найти существуют ли хоть один «546» элемент в коллекции
        System.out.println(list.stream().anyMatch(Integer.valueOf("546")::equals));

        //Найти есть ли символ «0» у всех элементов коллекции
        System.out.println("0 exists" + list.stream().allMatch(x -> x.toString().contains("0")));

        //Проверить что не существуют ни одного «a7» элемента в коллекции
        System.out.println(list.stream().noneMatch(Integer.valueOf("90")::equals));
        System.out.println(list.stream().noneMatch(Integer.valueOf("4")::equals));

        //Добавить "1000" к каждому элементу первой коллекции
        System.out.println(list.stream().map(x -> x + 10000).collect(Collectors.toList()));

        //Из второй коллекции получить сумму всех чисел, перечисленных через запятую
        int sum = list.stream().flatMapToInt(p -> Arrays.stream(p.toString().split(",")).mapToInt(Integer::parseInt)).sum();
        System.out.println(sum);
    }
}
