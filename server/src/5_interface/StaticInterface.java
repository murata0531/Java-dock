interface Foo {

    static void method(){
        System.out.println("Foo : method()");
    }
}

public class StaticInterface {
    public static void main(String[] args){
        Foo.method();
    }
}