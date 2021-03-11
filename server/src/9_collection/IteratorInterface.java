import java.util.*;

public class IteratorInterface {
    public static void main(String[] args){

        TreeSet<String> set = new TreeSet<String>();

        set.add("C");
        set.add("A");
        set.add("B");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}