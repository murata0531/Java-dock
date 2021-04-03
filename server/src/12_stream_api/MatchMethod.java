import java.util.*;
import java.util.stream.*;

public class MatchMethod {
    public static void main(String[] args){

        List<String> data1 = Arrays.asList("tanaka","yamada","ito");

        boolean result1 = data1.stream().allMatch(s -> s.length() >= 5);
        boolean result2 = data1.stream().anyMatch(s -> s.length() >= 5);
        boolean result3 = data1.stream().noneMatch(s -> s.length() >= 5);

        System.out.println(result1 + "\n" + result2 + "\n" + result3);

        Stream<String> stream1 = data1.stream();
        boolean result4 = stream1.allMatch(s -> s.length() >= 5);

        //throws IllegalStateException : 
        //Because the end operation can only be called once on the stream object
        // boolean result5 = stream1.anyMatch(s -> s.length() >= 5);
    }
}