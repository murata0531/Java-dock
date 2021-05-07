public class ScheduledExecutorServiceInterface {
    public static void main(String[] args){

        try {
            service = Executors.newSingleThreadExecutor();
            Runnable task1 = () -> System.out.println("task1");
            Callable<Date> task2 = () -> new Date();

            ScheduledFuture<?> result1 = service.schedule(task1,3,TimeUnit.SECONDS);
            ScheduledFuture<?> result2 = service.schedule(task2,1,TimeUnit.SECONDS);

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