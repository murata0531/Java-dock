class Outer {

    private int val1 = 100;
    private static int val2 = 200;

    //non-static inner class
    class A {

        //non-static method
        void method1(){
            System.out.println("A#method1()#instance val1 : " + val1);
            System.out.println("A#method1()#static val2 : " + val1);

            // this is Compile error because non-static classes cannot have static members
            // static void method2(){
            //     System.out.println("A#method2()#instance val1 : " + val1);
            //     System.out.println("A#method2()#static val2 : " + val1);
            // }
        }
    }
}