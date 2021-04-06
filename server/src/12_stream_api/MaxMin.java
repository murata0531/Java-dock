import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MaxMin {
    public static void main(String[] args){

        //data source
        List<String> data = Arrays.asList("aaa","bb","c");

        //Maximum value
        Optional<String> result1 = data.stream().max(Comparator.naturalOrder());
        //Number of characters
        Optional<String> result2 = data.stream().max((d1,d2) -> d1.length() - d2.length());

        result1.ifPresent(System.out::println);
        //ok
        // System.out.println(result1.get());
        result2.ifPresent(System.out::println);
        //ok
        // System.out.println(result2.get());

    }
}