import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Collectors {
    public static void main(String[] args){

        //collect()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        List<String> result1 = stream1.collect(Collectors.toList());

        System.out.println(result1);

        

    }
}