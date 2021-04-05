import java.util.*;
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
        Optional<Integer> result = stream1.reduce(operator);
        result.ifPresent(System.out::println);
    }
}