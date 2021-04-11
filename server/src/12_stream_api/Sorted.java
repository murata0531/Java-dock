import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Sorted {
    public static void main(String[] args){

        //asc
        Stream.of("yuki","akko","ami")
              .sorted()
              .forEach(x -> System.out.print(x + " "));

        System.out.println();

        //desc
        Stream.of("yuki","akko","ami")
              .sorted(Comparator.reverseOrder())
              .forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}