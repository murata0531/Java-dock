import java.util.*;

public class SuppressWarnings {
    @java.lang.SuppressWarnings(value = {"unchecked","deprecation"})
    // @java.lang.SuppressWarnings({"unchecked","deprecation"})
    public static void main(String[] args) {

        Date date = new Date("2021/03/15");
        List list = new ArrayList();
    }
}