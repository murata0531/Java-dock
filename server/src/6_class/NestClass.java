class Outer {

    private int val1 = 100;
    private static int val2 = 200;

    //non-static inner class
    class A {

        //non-static method
        void method1(){
            System.out.println("A#method1()#instance val1 : " + val1);
            System.out.println("A#method1()#static val2 : " + val2);

            // this is Compile error because non-static classes cannot have static members
            // static void method2(){
            //     System.out.println("A#method2()#instance val1 : " + val1);
            //     System.out.println("A#method2()#static val2 : " + val1);
            // }
        }
    }

    //static inner class
    static class B{

        //non-static method
        void method1(){

            //this is Compile error because static classes cannot access outer instance variables
            // System.out.println("B#method1()#instance val1 : " + val1);

            System.out.println("B#method1()#static val2 : " + val2);

            //static method
            static void method2(){

                //this is Compile error because static classes cannot access outer instance variables
                // System.out.println("B#method2()#instance val1 : " + val1);
                System.out.println("B#method2()#static val2 : " + val2);

            }
        }
    }
}