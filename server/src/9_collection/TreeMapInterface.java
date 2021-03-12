import java.util.*;

public class TreeMapInterface {
    public static void main(String[] args){

        NavigableMap<String,String> map = new TreeMap<String,String>();

        map.put("1111","itemA");
        map.put("2222","itemB");
        map.put("3333","itemC");
        map.put("4444","itemD");

        String key = "2000";

        if(map.containsKey(key)){
            System.out.println("get() : " + map.get(key));
        }else {
            System.out.println("higherKey() : " + map.higherKey(key));
            System.out.println("lowerKey() : " + map.lowerKey(key));
        }
        
        NavigableMap<String,String> sub = map.subMap("2000",true,"3500",true);

        System.out.println("2000 - 3500 : " + sub);
    }
}