import java.util.concurrent.*;
import java.util.*;

public class ScheduleWithFixedDelayMethod {
    public static void main(String[] args){

        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println(new Date());
            service.ScheduleWithFixedDelay(task1,2,2,TimeUnit.SECONDS);
            Thread.sleep(10000);

        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}