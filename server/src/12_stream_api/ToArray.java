import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ToArray {
    public static void main(String[] args){

       int[] array1 = IntStream.range(1,10).ToArray();
       int[] array2 = IntStream.rangeClosed(1,10).ToArray();
       Object[] array3 = Stream.of("a","b").ToArray();
       String[] array4 = Stream.of("a","b").ToArray(String::new);

        System.out.println("array1 : " + Arrays.toString(array1));
        System.out.println("array2 : " + Arrays.toString(array2));
        System.out.println("array3 : " + array3.getClass());
        System.out.println("array4 : " + array4.getClass());
    }
}