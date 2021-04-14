import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class AsDoubleStream {
    public static void main(String[] args){

        //IntStream<String> => DoubleStream :mapToDouble()
        IntStream stream1i = IntStream.of(2,3,5);
        DoubleStream stream1d = stream1i.mapToDouble(n -> n);
        System.out.println(stream1d.average().getAsDouble());

        //IntStream => Stream<Integer> :boxed()
        IntStream stream6o = IntStream.of(1,2,3);
        Stream<Integer> stream6n = stream6o.boxed();

    }
}