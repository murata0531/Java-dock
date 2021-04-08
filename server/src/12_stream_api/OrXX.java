import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class OrXX {
    public static void main(String[] args){

        //data source
        List<String> data = Arrays.asList("c","a");
        //findFirst()
        Optional<String> result1 = data.stream().findFirst();
        //findAny()
        Optional<String> result2 = data.stream().findAny();

        System.out.println("result1 : " + result1.get());
        System.out.println("result2 : " + result2.get());

        //empty data
        Stream<String> stream = Stream.empty();

        Optional<String> result3 = stream.findFirst();
        result3.ifPresent(r -> System.out.println("result3 : " + r));

        //data source
        IntStream intStream = IntStream.of(10,20,30);

        OptionalInt result4 = intStream.findFirst();

        //compile error
        // System.out.println("result4 : " + result4.get());
        System.out.println("result4 : " + result4.getAsInt());

    }
}