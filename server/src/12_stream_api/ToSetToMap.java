import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ToArray {
    public static void main(String[] args){

       Stream<String> stream1 = Stream.of("ami","akko","yuki");
       Set<String> set = stream1.collect(Collectors.toSet());

       System.out.println(set);
    }
}