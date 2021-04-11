import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FlatMap {
    public static void main(String[] args){

        // data sources
        List<Integer> data1 = Arrays.asList(10);
        List<Integer> data1 = Arrays.asList(20,30);
        List<Integer> data1 = Arrays.asList(40,50,60);

        List<List<Integer>> dataList = Arrays.asList(data1,data2,data3);

        //map()
        dataList.stream()
                .map(data -> data.stream())
                .forEach(l -> {
                    l.forEach(x -> System.out.print(x + " "));
                });
                
        System.out.println();
    }
}