import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer i1 = 1;
        int i2 = 2;
        Integer i3 = i1;
        list.add(i1);
        //boxing
        list.add(i2);
        // Duplicate element
        list.add(i3);
        list.add(1,5);

        // NG
        // list.add("abc");

        System.out.println("size : " + list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for(Integer i : list){
            System.out.print(i + " ");
        }

        System.out.println();
    }
}