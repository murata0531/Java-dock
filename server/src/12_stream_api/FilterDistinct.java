import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FilterDistinct {
    public static void main(String[] args){

        //data source
        Stream<String> stream1 = Stream.of("ami","yuki""akko");

        //filter()
        stream1.filter(s -> s.startWith("a"))
                .forEach(x -> System.out.print(x + " "));
        
        System.out.println();
    }
}