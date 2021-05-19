import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class Concurrent {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao").parallel();
        Map<String, List<String>> map1= stream1.collect(Collectors.groupingByConcurrent(s -> s.substring(0, 1)));
        System.out.println(map1);
        System.out.println("map1のクラス名 :" + map1.getClass());
        
        Stream<String> stream2 = Stream.of("nao", "akko", "ami").parallel();
        Map<Integer, String> map2 = 
                stream2.collect(Collectors.toConcurrentMap(
                                        String::length,
                                        s -> s,
                                        (s1, s2) -> s1 + " : " + s2));
                                        
        System.out.println(map2);
        System.out.println("map2のクラス名 :" + map2.getClass());
    }
}
