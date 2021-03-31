import java.util.*;
import java.util.function.*;

public class AndThenCompose {
    public static void main(String[] args){

        Function<String,Character> f1 = s -> s.charAt(0);
        Function<Character,Boolean> f2 = c -> Character.isUpperCase(c);

        //andThen
        Function<Character,Boolean> f3 = f1.andThen(f2);
        System.out.println(f3.apply("Java"));

        //compose
        Function<String,Boolean> f4 = f2.compose(f1);
        System.out.println(f4.apply("Java"));

    }
}