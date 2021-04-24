import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Collectors {
    public static void main(String[] args){

        //IntStream<String> => DoubleStream : mapToDouble()
        IntStream stream1i = IntStream.of(2,3,5);
        DoubleStream stream1d = stream1i.mapToDouble(n -> n);
        System.out.println(stream1d.average().getAsDouble());

        //IntStream<String> => DoubleStream : asDoubleStream()
        IntStream stream2i = IntStream.of(2,3,5);
        DoubleStream stream2d = stream2i.asDoubleStream();
        System.out.println(stream2d.average().getAsDouble());

    }
}