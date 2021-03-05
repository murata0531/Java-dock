public class MethodNest2 {

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

        new MethodNest2().new A().methodA();
        new MethodNest2.B().methodB();
        new B().methodB();
        MethodNest2.B.methodB();
        B.methodB();
    }

}