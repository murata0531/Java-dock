public class MethodNest1 {

    //non-static inner class
    class A {
        void methodA(){
            System.out.println("methodA()");
        }        
    }

    //static class
    static class B {
        static void methodB(){
            System.out.println("methodB()");
        }    
    }

    public static void main(String[] args){

        new MethodNest1().new A().methodA();
        new MethodNest1.B().methodB();
        new B().methodB();
        MethodNest1.B.methodB();
        B.methodB();
    }

}