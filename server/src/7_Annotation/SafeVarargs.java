import java.util.*;

public class SafeVarargs {
    public static void main(String[] args) {
        m(new ArrayList<String>());
    }

    @java.lang.SafeVarargs
    static void m(List<String>... stringLists){
        System.out.println(stringLists);
    }
}