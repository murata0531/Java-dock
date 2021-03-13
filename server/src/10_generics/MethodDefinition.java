import java.util.*;

class Gen {

    public <T> T methodA(T value){
        return value;
    }

    public static <T> void methodB(List<T> list){
        for(T obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

public class MethodDefinition {
    public static void main(String[] args){

        Gen g = new Gen();

        String s1 = g.methodA("ABC");
        String s2 = g.<String>methodA("ABC");
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        Gen.methodB(list);
        Gen.<String>methodB(list);

    }
}