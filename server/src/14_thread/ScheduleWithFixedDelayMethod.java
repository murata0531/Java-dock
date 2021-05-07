import java.util.concurrent.*;
import java.util.*;

public class ScheduleWithFixedDelayMethod {
    public static void main(String[] args){

        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("task1");
            Callable<Date> task2 = () -> new Date();

            ScheduledFuture<?> result1 = service.schedule(task1,3,TimeUnit.SECONDS);
            ScheduledFuture<?> result2 = service.schedule(task2,1,TimeUnit.MILLISECONDS);

            System.out.println(result2.get());

        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}