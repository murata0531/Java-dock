import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MaxByMinBy {
    public static void main(String[] args){

        //minBy()
        Stream<String> stream1 = Stream.of("ami","akko","yuki");
        Optional<String> result1 = stream1.collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(result1.get());

        //maxBy()
        Stream<String> stream2 = Stream.of("101","105","106","203","205");
        Map<String,Optional<String>> result2 = stream2.collect(
                                                    Collectors.groupingBy(
                                                        s -> s.substring(0,1),
                                                        Collectors.maxBy(Comparator.naturalOrder())
                                                    )
                                                );
    }
}