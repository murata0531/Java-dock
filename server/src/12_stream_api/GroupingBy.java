import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class GroupingBy {
    public static void main(String[] args){

        //iterate() : generate unlimited stream 
        // => limit()
        IntStream.iterate(1,n -> n + 1).limit(10L).forEach(x -> System.out.print(x + " "));

        System.out.println();

        //rangeClosed() : generate 10 limited stream 
        // => skip(5L)
        IntStream.rangeClosed(1,10).skip(5L).forEach(x -> System.out.print(x + " "));

        System.out.println();

        //skip(100L) => limit(5L)
        IntStream.iterate(1,n -> n + 1).skip(100L).limit(5L).forEach(x -> System.out.print(x + " "));

        System.out.println();

        //generate() : generate unlimited stream
        Stream<String> stream = Stream.generate(() -> "Java");
        //limit(3L)
        stream.limit(3L).forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}