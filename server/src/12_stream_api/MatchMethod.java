import java.util.*;

public class MatchMethod {
    public static void main(String[] args){

        List<String> data1 = Arrays.asList("tanaka","yamada","ito");

        boolean result1 = data1.stream().allMatch(s -> s.length() >= 5);
        boolean result2 = data1.stream().anyMatch(s -> s.length() >= 5);
        boolean result3 = data1.stream().noneMatch(s -> s.length() >= 5);

        System.out.println(result1 + "\n" + result2 + "\n" + result3);

        
    }
}