import java.util.function.*;

public class OrAndNegegate {
    public static void main(String[] args){

        LongPredicate p1 = n -> (n % 3) == 0;
        LongPredicate p2 = n -> (n % 5) == 0;

        LongPredicate p3 = p1.or(p2);
        System.out.println(p3.test(5));

        LongPredicate p4 = p1.and(p2);
        System.out.println(p3.test(15));

        LongPredicate p5 = p1.negate(p2);
        System.out.println(p3.test(15));
    }
}