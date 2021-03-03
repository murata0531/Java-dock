interface Foo {
    private static void p1(){
        System.out.println("Foo : p1()");
    }

    private static void p2(){
        System.out.println("Foo : p2()");
    }

    static void methodA(){
        System.out.println("Foo : methodA()");
        p1();
        //p2(); コンパイルエラー
    }

    default void methodB(){
        System.out.println("Foo : methodB()");
        p1();
        p2();
    }
}

class FooImp implements Foo {

}

public class PrivateInterface {
    public static void main(String[] args){
        Foo.methodA();
        new FooImp().methodB();
    }
}