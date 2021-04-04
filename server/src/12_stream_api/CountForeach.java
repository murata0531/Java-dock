import java.util.*;
import java.util.stream.*;

public class CountForeach {
    public static void main(String[] args){

        long result1 = stream.of("a","b","c");
        System.out.println(result1);

        Stream<String> stream1 = stream.of("a","b","c");
        stream1.forEach(System.out::print);

        System.out.println();
        
        // This is compile error : Because stream interface does not inherit "iterable"
        // for(String s : stream1){
        //     System.out.print(s);
        // }
    }
}