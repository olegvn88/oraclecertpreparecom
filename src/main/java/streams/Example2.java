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
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        Integer integer = collect.parallelStream().reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(integer);
    }
}
