interface MyInter1 {
    double methodA(int num);
    default void methodB(){
        System.out.println("methodB");
    }
}

interface MyInter2 {
    int methodC(int val1, int val2);
    static void methodD(){
        System.out.println("methodD");
    }
}