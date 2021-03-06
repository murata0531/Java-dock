import java.util.*;

public class SuppressWarnings {
    @SuppressWarnings(value = {"unchecked","deprecation"})
    // @SuppressWarnings({"unchecked","deprecation"})
    public static void main(String[] args) {

        Date date = new Date("2021/03/15");
        List list = new ArrayList();
    }
}