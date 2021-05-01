import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MaxByMinBy {
    public static void main(String[] args){

        //map()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        Optional<String> result1 = stream1.collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(result1.get());
    }
}