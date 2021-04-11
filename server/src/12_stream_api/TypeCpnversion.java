import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TypeConversion {
    public static void main(String[] args){

        //Stream<String> => Stream<Integer> :map()
        Stream<String> stream1o = Stream.of("a","b");
        Stream<Integer> stream1n = stream1o.map(s -> s.length());

    }
}