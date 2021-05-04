public class RunnableLambda {
    public static void main(String[] args){

        //Anonymous class
        new Thread(new Runnable(){
            public void run(){
                System.out.println("hello");
            }
        }).start();

        //Lambda
        new Thread(() -> {
            System.out.println("hello");
        }).start();
    }
}

