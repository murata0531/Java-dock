import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class GroupingBy {
    public static void main(String[] args){

        Stream<String> stream1 = Stream.of("belle","akko","ami","bbb","nao");
        Map<String,List<String>> map1 = stream1.collect(Collectors.groupingBy(s -> s.substring(0,1)));

        System.out.println(map1);

        Stream<String> stream2 = Stream.of("belle","akko","ami","bbb","nao");
        Map<String,Set<String>> map2 = stream2.collect(Collectors.groupingBy(s -> s.substring(0,1),Collectors.toSet()));

        System.out.println(map2);

        Stream<String> stream3 = Stream.of("belle","akko","ami","bbb","nao");
        Map<String,String> map3 = stream2.collect(Collectors.groupingBy(s -> s.substring(0,1),Collectors.joining()));

        System.out.println(map3);

    }
}