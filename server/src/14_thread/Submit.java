import java.util.concurrent.*;
import java.util.*;

public class Submit {
    public static void main(String[] args){

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();

            Future<?> result1 = service.submit(() -> System.out.println("hello"));
            System.out.println(result1.get());

            Future<Boolean> result2 = service.submit(() -> System.out.println("hello"),true);
            System.out.println(result2.get());
            
        }catch(InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if(service != null){
                service.shutdown();
            }
        }
        
    }
}