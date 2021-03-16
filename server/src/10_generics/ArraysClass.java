import java.util.*;

public class ArraysClass {
    public static void main(String[] args){

        int[] ary1 = {3,1,2};
        print(ary1);
        Arrays.sort(ary1);
        print(ary1);

        Object[] ary2 = {"aa",10};
        //class cast exception
        // Arrays.sort(ary2);

        Integer[] ary3 = {1,2,3};
        List<Integer> list = Arrays.asList(ary3);
        list.set(2,4);
        //Elements cannot be added or removed
        // list.add(5);

        list.forEach(l -> System.out.print(l + " "));

        System.out.println();
    }

    public static void print(int[] ary){
        for(int num : ary){
            System.out.print(num + " ");
        }

        System.out.println();
    }
}