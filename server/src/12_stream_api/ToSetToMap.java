import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ToSetToMap {
    public static void main(String[] args){

        //toSet()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        Set<String> set = stream1.collect(Collectors.toSet());

        System.out.println(set);

        //toMap()
        Stream<String> stream2 = Stream.of("ami","akko","yuki");
        Map<String,String> map = stream2.collect(Collectors.toMap(s -> s, String::toUpperCase));

        System.out.println(map);

    }
}