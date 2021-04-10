import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MapMethod {
    public static void main(String[] args){

        // Stream<String> => Stream<String>
        Stream<String> stream1a = Stream.of("yuki","akko","ami");
        Stream<String> stream1b = stream1a.map(s -> s.toUpperCase());
        stream1b.forEach(x -> System.out.print(x + " "));

        System.out.println();

        // Stream<String> => Stream<Integer>
        Stream<String> stream2s = Stream.of("yuki","akko","ami");
        Stream<Integer> stream2i = stream2s.map(s -> s.length());
        stream2i.forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}