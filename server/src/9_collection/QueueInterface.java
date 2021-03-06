import java.util.*;

public class QueueInterface {
    public static void main(String[] args){

        //First In First Out
        Queue<String> queue = new ArrayDeque<String>();

        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println(queue);
        System.out.println("element : " + queue.element());
        System.out.println(queue);
        System.out.println("remove : " + queue.remove());
        System.out.println(queue);

        for(String s : queue){
            queue.poll();
        }

        System.out.println(queue.peek());
        // throws exception
        // System.out.println("element : " + queue.element());

    }
}