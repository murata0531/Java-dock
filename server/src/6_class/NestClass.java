class Outer {

    private int val1 = 100;
    private static int val2 = 200;

    //no static inner class
    class A {

        //no static method
        void method1(){
            System.out.println("A#method1()#instance val1 : " + val1);
            System.out.println("A#method1()#static val2 : " + val1);

        }
    }
}