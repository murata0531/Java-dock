import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MaxMin {
    public static void main(String[] args){

        Optional<Integer> op1 = Optional.of(10);
        Optional<Integer> op2 = Optional.empty();

        System.out.println("op1.get() : " + op1.get());
        //Throws NoSuchElementException
        // System.out.println("op2.get() : " + op2.get());

        System.out.println("op1.isPresent() : " + op1.isPresent());
        System.out.println("op2.isPresent() : " + op2.isPresent());

        System.out.println("op1.isEmpty() : " + op1.isEmpty());
        System.out.println("op2.isEmpty() : " + op2.isEmpty());

    }
}