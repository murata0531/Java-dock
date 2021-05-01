import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MaxByMinBy {
    public static void main(String[] args){

        //map()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        String result1 = stream1.map(s -> s.toUpperCase()).collect(Collectors.joining(":"));
        System.out.println(result1);

        //mapping()
        Stream<String> stream2 = Stream.of("ami","akko","yuki");
        String result2 = stream2.collect(Collectors.mapping(s -> s.toUpperCase(),Collectors.joining(":")));
        System.out.println(result2);
    }
}