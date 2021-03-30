import java.util.*;
import java.util.function.*;

public class ToTransformation {
    public static void main(String[] args){

        // lambda
        ToIntFunction<String> l1 = s -> s.length();
        //method reference
        ToIntFunction<String> f1 = String::length;
        int ans1 = f1.applyAsInt("Java");

        //lambda
        IntToDoubleFunction f2 = i ->i * 1.10;
        //NG : Becouse automatic conversion is not performed with the argument of the lambda expression
        // IntToDoubleFunction f2 = (Integer i) -> { return i * 1.10; };

        double ans2 = f2.applyAsDouble(1000);

    }
}