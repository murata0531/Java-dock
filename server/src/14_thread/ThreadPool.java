import java.util.concurrent.*;
import java.util.Date;

public class ThreadPool {
    public static void main(String[] args) {

       ExecutorService service = null;

        try {
            service = Executors.newCachedThreadPool();
            //service = Executors.newFixedThreadPool(2);

            Runnable task = () -> {
                String name = Thread.currentThread().getName();
                System.out.println(name + " : start");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " : end");
            };

            for(int i = 0; i < 5; i++){
                service.execute(task);
            }

        } finally {
            if(service != null) service.shutdown(); 
        }
    }
}