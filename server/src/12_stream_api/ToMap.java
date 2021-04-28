import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ToMap {
    public static void main(String[] args){

        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        Map<String,Integer> map1 = stream1.collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map1);

    }
}