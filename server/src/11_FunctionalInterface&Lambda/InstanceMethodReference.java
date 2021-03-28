import java.util.*;
import java.util.function.*;

public class InstanceMethodReference {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(3,1,2);

        //for
        for(int a : list){
            System.out.println(a);
        }

        //foreach lambda
        list.forEach(a -> System.out.println(a));

        // instance method reference
        list.forEach(System.out::println);

        // lambda
        UnaryOperator<String> obj = s -> s.toUpperCase();

        // instance method reference
        UnaryOperator<String> obj2 = String::toUpperCase;

        System.out.println(obj2.apply("YAMADA"));

        //lambda
        BiFunctuon<String,Integer,Caracter> bf1 = (s,i) -> s.charAt(i);
        System.out.println(bf1.apply("Java",2));

        BiFunctuon<Integer,String,Caracter> bf2 = (i,s) -> s.charAt(i);
        System.out.println(bf2.apply(2,"Java"));

        // instance method reference
        BiFunctuon<String,Integer,Caracter> bf3 = String::charAt;
        System.out.println(bf1.apply("Java",2));

        //compile error
        // = BiFunctuon<Integer,String,Caracter> bf2 = (i,s) -> i.charAt(s);
        // BiFunctuon<Integer,String,Caracter> bf = String::charAt;
        // System.out.println(bf1.apply(2,"Java"));
    }
}