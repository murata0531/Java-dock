import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Sorted {
    public static void main(String[] args){

        Stream.of("yuki","akko","ami")
              .sorted()
              .forEach(x -> System.out.print(x + " "));
              
        System.out.println();
    }
}