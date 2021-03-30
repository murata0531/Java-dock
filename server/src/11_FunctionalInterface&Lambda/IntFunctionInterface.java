import java.util.*;
import java.util.function.*;

public class IntFunctionInterface {
    public static void main(String[] args){

        // lambda
        IntFunction<String[]> l1 = size -> new String[size];
        //method reference
        IntFunction<String[]> f1 = String[]::new;
        String[] ans1 = f1.apply(5);

        //lambda
        IntFunction<Double> f2 = i -> Math.random() * i;
        Double ans2 = f2.apply(10);

        //This is compile error : Becouse the return value is Object type
        // IntFunction f2 = i -> Math.random() * i;


        IntSupplier f3 = "Java"::length;
        int ans3 = f3.getAsInt();
    }
}