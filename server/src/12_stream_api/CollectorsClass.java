import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CollectorsClass {
    public static void main(String[] args){

        //collect()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        List<String> result1 = stream1.collect(Collectors.toList());

        System.out.println(result1);

        //joining()
        Stream<String> stream2 = Stream.of("ami","akko","yuki");
        String result2 = stream2.collect(Collectors.joining("|"));

        System.out.println(result2);

        //SummingInt()
        Stream<String> stream3 = Stream.of("ami","akko","yuki");
        Integer result3 = stream3.collect(Collectors.summingInt(t -> t.length()));

        System.out.println(result3);

    }
}