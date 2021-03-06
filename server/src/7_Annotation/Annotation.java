class Parent {
    void bar(){
        System.out.println("Parent#bar");
    }
}

class Child extends Parent {
    @java.lang.Override
    void bal(){
        System.out.println("Child#bar");
    }
}

public class Annotation {
    public static void main(String[] args){
        new Child().bar();
    }
}