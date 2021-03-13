interface MyIn<T> {
    void method(T t);
}

class Foo implements MyIn<String>{
    public void method(String s){
        System.out.println(s);
    }
}
public class InterfaceDeclaration {
    public static void main(String[] args){

        new Foo().method("ABC");

        new MyIn<Integer>() {
            public void method(Integer i){
                System.out.println(i);
            }
        }.method(100);
    }
}