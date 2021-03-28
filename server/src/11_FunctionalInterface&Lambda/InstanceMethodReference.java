import java.util.*;
import java.util.function.*;

public class InstanceMethodReference {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(3,1,2);

        //for
        for(int a : list){
            System.out.println(a);
        }

        //foreach lambda
        list.forEach(a -> System.out.println(a));

        // instance method reference
        list,foreach(System.out::println);
    }
}