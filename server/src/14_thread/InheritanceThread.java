public class InheritanceThread {
    public static void main(String[] args){

        //creat two thread
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        //thread start
        a.start();
        b.start();
    }
}

class ThreadA extends Thread {
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("A : " + i + " ");
        }
    }  
}

class ThreadB extends Thread {
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("B : " + i + " ");
        }
    }  
}

