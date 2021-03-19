import java.util.*;

public class ReplaceAll {
    public static void main(String[] args){

        List<String> words = Arrays.asList("TANAKA","SATO");

        // Anonymous Class
        words.replaceAll(new UnaryOperator<String>(){
            public String apply(String str){
                return str.toLowerCase();
            }
        });

        System.out.println(words);

        //lambda
        words.replaceAll( (String str) -> { return str.toUpperCase(); });

        System.out.println(words);
    }
}