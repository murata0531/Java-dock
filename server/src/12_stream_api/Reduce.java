import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Reduce {
    public static void main(String[] args){

        Stream<Integer> stream = Stream.of(10,20,30);

        int result = stream.reduce(0,(a,b) -> a + b);
        //ok
        //int result = stream.reduce(0,Integer::sum);

        System.out.println(result);

        BinaryOperator<Integer> operator = (a,b) -> a + b;
        Stream<Integer> stream1 = Stream.of(10,20,30);
        Optional<Integer> result1 = stream1.reduce(operator);
        result1.ifPresent(System.out::println);

        Stream<Integer> stream2 = Stream.empty();
        Optional<Integer> result2 = stream2.reduce(operator);
        System.out.println(result2);
        result2.ifPresent(System.out::println);
    }
}