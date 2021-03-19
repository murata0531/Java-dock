import java.util.function.*;

class MyFunc implements Function<String,String> {
    public String apply(String str){
        return "Hello " + str;
    }
}

public class FunctionalInterface {
    public static void main(String[] args){

        MyFunc obj = new MyFunc();
        String str1 = obj.apply("Yamada");
        System.out.println(str1);

        //Anonymous class
        String str2 = new Function<String,String>(){
            public String apply(String str){
                return "Hello " + str;
            }
        }.apply("Taro");

        System.out.println(str2);
    }
}