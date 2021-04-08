import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class OrXX {
    public static void main(String[] args){

        Stream<Double> stream = Stream.empty();
        Optional<Double> result = stream.findFirst();

        //orElse
        System.out.println(result.orElse(0.0));

        //orElseGet
        System.out.println(result.orElseGet(() -> Math.random()));

        //orElseThrow
        System.out.println(result.orElseThrow(IllegalArgumentException::new));
    }
}