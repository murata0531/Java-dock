import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FilterDistinct {
    public static void main(String[] args){

        //data source
        Stream<String> stream1 = Stream.of("ami","yuki","akko");

        //filter()
        stream1.filter(s -> s.startsWith("a"))
               .forEach(x -> System.out.print(x + " "));
        
        System.out.println();

        //data source
        Stream<String> stream2 = Stream.of("ami","","akko");

        //filter() empty()
        stream2.filter(Predicate.not(s -> s.isEmpty()))
               .forEach(x -> System.out.print(x + " "));
        
        System.out.println();

        //data source
        Stream<String> stream3 = Stream.of("ami","ami","akko","yuki",10);

        //distinct()
        stream3.distinct()
               .forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}