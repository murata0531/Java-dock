import java.util.*;
import java.util.stream.*;

public class Collect {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("orange", "banana", "lemon");

        List<String> list = 
                data.parallelStream()
                    .collect(() -> new CopyOnWriteArrayList<>(),
                            (plist, s) -> plist.add(s.toUpperCase()),
                            (alist, blist) -> alist.addAll(blist));

        for(String s : list){
            System.out.print(s + " ");
        }
    
        System.out.println();

        Set<String> set = 
                data.parallelStream()
                    .collect(CopyOnWriteArraySet::new,
                            Set::add,
                            Set::addAll);

        for(String e : set){
            System.out.print(e + " ");
        }

        System.out.println();
    }
}
