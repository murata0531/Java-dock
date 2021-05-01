import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PartitioningBy {
    public static void main(String[] args){

        Stream<Integer> stream1 = Stream.of(3,5,7,9);
        Map<Boolean,List<Integer>> map1 = stream1.collect(Collectors.partittioningBy(s -> s > 5))
        System.out.println(map1);
    }
}