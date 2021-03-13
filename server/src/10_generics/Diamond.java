import java.util.*;

public class Diamond {
    public static void main(String[] args){

        Map<Integer,String> map = new HashMap<>();
        map.put(10,"A");

        List<String> list1 = new ArrayList<>();
        list.add("B");

        methodA(new ArrayList<>());

        List<String> list2 = methodB();
    }

    static void methodA(List<String> list){
        System.out.println("methodA()");
        list.add("B");
    }

    static ArrayList<String> methodB(){
        System.out.println("methodB()");
        return new ArrayList<>();
    }
}