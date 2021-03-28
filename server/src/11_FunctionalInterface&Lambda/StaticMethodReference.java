import java,util.*;
import java.util.function.*;

public class StaticMethodReference {
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
    }
}