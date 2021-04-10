import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LimitSkip {
    public static void main(String[] args){

        //iterate(), limit()
        IntStream.iterate(1,n -> n + 1).limit(10L).forEach(x -> System.out.print(x + " "));

        System.out.println();

        //rangeClosed(), skip()
        IntStream.rangeClosed(1,10).skip(5L).forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}