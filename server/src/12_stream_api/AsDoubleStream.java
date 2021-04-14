import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class AsDoubleStream {
    public static void main(String[] args){

        //IntStream<String> => DoubleStream : mapToDouble()
        IntStream stream1i = IntStream.of(2,3,5);
        DoubleStream stream1d = stream1i.mapToDouble(n -> n);
        System.out.println(stream1d.average().getAsDouble());

        //IntStream<String> => DoubleStream : asDoubleStream()
        IntStream stream2i = IntStream.of(2,3,5);
        DoubleStream stream2d = stream1i.asToDoubleStream();
        System.out.println(stream2d.average().getAsDouble());

    }
}