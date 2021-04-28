import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ToMap {
    public static void main(String[] args){

        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        Map<String,Integer> map1 = stream1.collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map1);

        //Throws IllegalStateException : Because the number of characters is the same, the keys are duplicated
        // Stream<String> stream2 = Stream.of("ami","akko","yuki");
        // Map<Integer,String> map2 = stream1.collect(Collectors.toMap(String::length,s -> s));

        // System.out.println(map2);

        Stream<String> stream3 = Stream.of("ami","akko","yuki");
        Map<Integer,String> map3 = stream3.collect(Collectors.toMap(String::length,s -> s,(s1,s2) -> s1 + " : " + s2));

        System.out.println(map3);
        System.out.println(map3.getClass());
    }
}