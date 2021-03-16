import java.util.*;

public class FactoryMethod {
    public static void main(String[] args){

        List<Integer> list = List.of(1,2,1);
        System.out.println("list : " + list);

        Set<Integer> set = Set.of(1,2,3);
        // Runtime Exception
        // Set<Integer> set = Set.of(1,2,1);
        System.out.println("set : " + set);

        Map<Integer,String> map = Map.of(1,"A",2."B",3,"C");
        System.out.println("map : " + map);

    }
}