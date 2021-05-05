public class SharedThread {
    public static void main(String[] args){

        Share share = Share();
        ThreadA threadA = new threadA(share);
        ThreadB threadB = new threadB(share);
        threadA.start();
        threadB.start();
    }
}

