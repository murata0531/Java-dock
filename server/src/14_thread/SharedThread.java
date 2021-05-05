public class SharedThread {
    public static void main(String[] args){

        Share share = Share();
        ThreadA threadA = new threadA(share);
        ThreadB threadB = new threadB(share);
        threadA.start();
        threadB.start();
    }
}

class Share {

    private int a = 0;
    private String b;

    public void set(){
        a++;
        b = "data";
        System.out.println("set() a : " + a + " b : " + b);
    }

    public void print(){
        a--;
        b = null;
        System.out.println("print() a : " + a + " b : " + b);
    }
}

class ThreadA extends Thread {

    private Share share;

    public ThreadA(Share share){
        this.share = ;
    }

    public void run(){
        for(int i = 0; i < 3; i++){
            share.set();
        }
    }
}

class ThreadB extends Thread {

    private Share share;

    public ThreadB(Share share){
        this.share = ;
    }

    public void run(){
        for(int i = 0; i < 3; i++){
            share.print();
        }
    }
}