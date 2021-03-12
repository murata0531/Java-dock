import java.util.*;

public class HashMapInterface {
    public static void main(String[] args){

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(0,"A");
        map.put(1,"B");
        map.put(2,"A");
        // Duplicate key: The value will be overwritten
        map.put(1,"C");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("X"));

        for(int i = 0; i < map.size(); i++){
            System.out.println(map.get(i) + " ");
        }
    }
}