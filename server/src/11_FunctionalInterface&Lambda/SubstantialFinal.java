import java.util.function.*;

public class SubstantialFinal {

    int a = 10;

    public void method(){

        final int b = 20;
        // Substantial Final
        int c = 30;
        int d = 40;
        // Substantial Final
        int e = 60;

        Function<String,String> f1 = (String str) -> {

            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("c : " + c);

            //compile error
            // System.out.println("c : " + d);
            // e = 100;

            return "Hello " + str;
        }

        System.out.println(f1.apply("YAMADA"));
    }

    public static void main(String[] args){
        new SubstantialFinal().method();
    }
}