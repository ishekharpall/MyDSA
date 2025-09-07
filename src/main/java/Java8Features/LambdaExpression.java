package Java8Features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {

        Predicate<Integer> isEven = a-> a%2==0;
        System.out.println(isEven.test(11));

        Consumer<Integer> reverse = n ->{
            int rev =0;
            int rem=n/10;
           rev=rem*10+rem;
            System.out.println(rev);
        };

       reverse.accept(123);

       BiConsumer<Integer,Integer> sum =(a, b) -> System.out.println(a + b);
      sum.accept(3,5);
    }

}
