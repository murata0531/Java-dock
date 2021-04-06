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

        //Minimum value
        Optional<String> result3 = data.stream().min(Comparator.naturalOrder());
        //Number of characters
        Optional<String> result4 = data.stream().min((d1,d2) -> d1.length() - d2.length());

        result3.ifPresent(System.out::println);
        //ok
        // System.out.println(result3.get());
        result4.ifPresent(System.out::println);
        //ok
        // System.out.println(result4.get());
    }
}