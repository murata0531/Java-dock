import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TypeConversion {
    public static void main(String[] args){

        //Stream<String> => Stream<Integer> :map()
        Stream<String> stream1o = Stream.of("a","b");
        Stream<Integer> stream1n = stream1o.map(s -> s.length());

        //Stream<String> => IntStream :mapToInt()
        Stream<String> stream2o = Stream.of("yuki","akko","ami");
        IntStream stream2n = stream2o.mapToInt(s -> s.length());

        //Stream<Integer> => IntStream :mapToInt()
        Stream<Integer> stream3o = Stream.of(1,2,3);
        IntStream stream3n = stream3o.mapToInt(n -> n * 10);

        //Stream<Integer> => Stream<String> :map()
        Stream<Integer> stream4o = Stream.of(1,2,3);
        Stream<String> stream4n = stream4o.map(n -> n + "n");


    }
}