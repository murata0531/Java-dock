public class ThreadControll {
    public static void main(String[] args){

        Tread treadA = new Thread(() -> {

            System.out.println("threadA : sleep");

            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("threadA : caught an interrupt");
            }

            System.out.println("threadA : resume");

        });

        treadA.start();

        try {
            System.out.println("main : sleep");
            thread.sleep(2000);
            System.out.println("main : sleep end");
            threadA.Interrupt();
        }catch(InterruptedException e){
            System.out.println("main : caught an interrupt");
        }
    }
}

