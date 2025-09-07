package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shekhar","Priyanka","Sagar","Amarjeet","Shekhar");
              names.stream()
             .filter(name -> name.startsWith("S"))
             .map(String::toUpperCase)
             .distinct()
             .sorted()
             .forEach(System.out::println);


        List<Integer> num = Arrays.asList(2,4,3,5,6,8,7,10,12,3,3);

         List<Integer> even = num.stream()
                 .filter(n -> n%2==0)
                 .distinct()
                 .sorted()
                 .toList();
        System.out.println(even);
        List<Integer> isOdd = Arrays.asList(1,3,5,7,8,10,11,14,16);

         List<Integer> odd=isOdd.stream().filter(n -> n%2!=0)
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(odd);

        int element  =  num.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(element);


    }



}
