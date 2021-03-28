import java.util.*;
import java.util.function.*;

public class InstanceMethodReference {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(3,1,2);

        //anonymous class
        Consumer<List<Integer>> con1 = new Consumer<List<Integer>>(){
            public void accept(List<Integer> list){
                Collections.sort(list);
            }
        };

        //lambda
        Consumer<List<Integer>> con2 = lamdaList -> Collections.sort(lamdaList);

        //static method reference
        Consumer<List<Integer>> con3 = Collections::sort;

        con3.accept(list);
        System.out.println(list);

        //lambda
        Comparator<Integer> comp = (x,y) -> Integer.compare(x,y);

        //static method reference
        Comparator<Integer> comp2 = Integer::compare;

        System.out.println(comp.compare(1,2));
        System.out.println(comp2.compare(2,1)); 

    }
}