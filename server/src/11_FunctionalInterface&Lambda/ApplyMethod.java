import java.util.*;
import java.util.function.*;

public class ApplyMethod {
    public static void main(String[] args){

        // Anonymous Class
        String str1 = new Function<String,String>(){
            public String apply(String str){
                return "Hello" + str;
            }
        }.apply("TARO");

        System.out.println("Anonymous Class : " + str1);

        // Lambda(No Omit)
        Function<String,String> f2 = (String str) -> {
            public String apply(String str){
                return "Hello" + str;
            }
        };
        String str2 = f2.apply("YAMADA TARO");
        System.out.println("Lambda(No Omit) : " + str2);

        // Lambda(Omit)
        Function<String,String> f3 = str -> "Hello" + str;
        String str3 = f3.apply("YAMADA");
        System.out.println("Lambda(Omit) : " + str2);
    }
}