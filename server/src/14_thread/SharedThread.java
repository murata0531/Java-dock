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
        System.out.println("set() a : " + a + " b : " + b);
    }
}