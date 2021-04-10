import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LimitSkip {
    public static void main(String[] args){

        //iterate()
        IntStream.iterate(1,n -> n + 1).limit(10L).forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}