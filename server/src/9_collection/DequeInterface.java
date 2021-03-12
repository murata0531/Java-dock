import java.util.*;

public class DequeInterface {
    public static void main(String[] args){

        Deque<String> deque = new ArrayDeque<String>();

        deque.push("1");
        deque.push("2");
        deque.push("3");

        System.out.println(deque);
        System.out.println("pop : " + deque.pop());
        System.out.println(deque);
    }
}