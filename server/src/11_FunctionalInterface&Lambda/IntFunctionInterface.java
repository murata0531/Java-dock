import java.util.*;
import java.util.function.*;

public class IntFunctionInterface {
    public static void main(String[] args){

        //lambda
        // Supplier<Foo> obj1 = () -> new Foo();
        Supplier<Foo> obj1 = Foo::new;
        System.out.println(obj1.get().a);

        //lambda
        // Function<Integer,Foo> obj2 = i -> new Foo(i);
        Function<Integer,Foo> obj2 = Foo::new;
        System.out.println(obj2.apply(10).a);

        //lambda
        // Supplier<List<Foo>> obj3 = () ->new ArrayList<>();
        Supplier<List<Foo>> obj3 = ArrayList::new;
        System.out.println(obj3.get().size());


        Set<Foo> set = Set.of(new Foo(10), new Foo(20));

        //lamda
        // Function<Set<Foo>, List<Foo>> obj4 = (s) -> new ArrayList<>(s);
        Function<Set<Foo>, List<Foo>> obj4 = ArrayList::new;
        System.out.println(obj4.apply(set).size());

        // arrays
        Function<Integer,String[]> obj5 = String[]::new;
        System.out.println(obj5.apply(5).length);
    }
}