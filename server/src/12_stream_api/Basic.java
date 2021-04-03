import java.util.*;

public class Basic {
    public static void main(String[] args){

        //data source
        List<String> list = Arrays.asList("BB","AA","CC");

        //up to now
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i).toUpperCase();
            list.set(i,str);
        }

        Collections.sort(list);

        for(String str : list){
            System.out.print(str + " ");
        }

        System.out.println();

    }
}