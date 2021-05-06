import java.util.concurrent.*;
import java.util.*;

public class NewSingleThreadExecutor {
    public static void main(String[] args){

        BlockingQueue<Double> queue = new LinkedBlockingQueue<>(3);

        new Thread(() -> {
            while(true){
                try {
                    queue.offer(Math.random(),2,TimeUnit.SECONDS);
                    System.out.println("offer() : " + queue.size());
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while(true){
                try {
                    double pNum = queue.poll(2,TimeUnit.SECONDS);
                    System.out.println("poll() : " + pNum);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}