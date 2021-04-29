import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class GroupingBy {
    public static void main(String[] args){

        Stream<String> stream1 = Stream.of("belle","akko","ami","bbb","nao");
        Map<String,List<String>> map1 = stream1.collect(Collectors.groupingBy(s -> s.substring(0,1)));

        System.out.println(map1);
    }
}