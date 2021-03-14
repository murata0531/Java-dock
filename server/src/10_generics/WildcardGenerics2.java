import java.util.*;

class X {
    public String toString(){
        return "X";
    }
}

class Y extends X {
    public String toString(){
        return "Y";
    }
}

public class WildcardGenerics2 {

    public static void method1(List<? extends X> list){

        // Compile error: When using wildcards, the method does not know the type of the object it receives as an argument until runtime.
        // list.add(new X());
        // list.add(new Y());
        System.out.print(list.get(0) + " ");
    }

    public static void method2(List<? super Y> list){

        //Compile OK : Only objects of the same type as the type specified in "super" are possible
        list.add(new Y());
        System.out.print(list.get(0) + " ");
    }

    public static void main(String[] args){

        List<X> l1 = new ArrayList<>();
        l1.add(new X());

        List<Y> l2 = new ArrayList<>();
        l2.add(new Y());

        method1(l1);
        method1(l2);
        method2(l1);
        method2(l2);

        System.out.println();
    }
}