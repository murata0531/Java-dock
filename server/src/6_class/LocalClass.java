class Outer {

    private static int a = 1;
    private int b = 2;

    void methodOuter(final int c, int d){

        final int e = 5;
        int f = 6;

        class A {
            void method(){
                System.out.println(a + "");
                System.out.println(b + "");
                System.out.println(c + "");
                System.out.println(d + "");
                System.out.println(e + "");
                System.out.println(f + "");

                //this is compile error because  these variables are effectively final
                // d = 100;
                // f = 100;
            }
        }

        new A().method();
    }
}

public class LocalClass {
    public static void main(String[] args){
        Outer o = new Outer();
        o.methodOuter(3,4);
    }
}