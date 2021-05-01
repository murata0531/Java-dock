import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Mapping {
    public static void main(String[] args){

        Stream<Integer> stream1 = Stream.of(3,5,7,9);
        Map<Boolean,List<Integer>> map1 = stream1.collect(Collectors.partitioningBy(s -> s > 5));
        System.out.println(map1);

        Stream<Integer> stream2 = Stream.of(3,5,7,9);
        Map<Boolean,List<Integer>> map2 = stream2.collect(Collectors.partitioningBy(s -> s > 10));
        System.out.println(map2);

        Stream<Integer> stream3 = Stream.of(3,5,7,9);
        Map<Boolean,Integer> map3 = stream3.collect(Collectors.partitioningBy(s -> s > 5,Collectors.summingInt(n -> n)));
        System.out.println(map3);
    }
}