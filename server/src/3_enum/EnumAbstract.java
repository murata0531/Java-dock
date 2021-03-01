enum Vals {

    A {
        void foo(){ System.out.println("A"); }
    },
    B {
        void foo(){ System.out.println("B"); }
    };

    abstract void foo();
}

public class EnumAbstract {
    public static void main(String[] args){

        Vals obj = Vals.A;
        obj.foo();
    }
}