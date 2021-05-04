public class RunnableLambda {
    public static void main(String[] args){

        //creat two thread
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        //thread start
        a.start();
        b.start();
    }
}

class ThreadA implements Runnable {
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("A : " + i + " ");
        }
    }  
}

class ThreadB implements Runnable {
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("B : " + i + " ");
        }
    }  
}

