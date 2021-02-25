class Foo {

    final int num1 = 10;
    final int num2;

    Foo(int i){
        num2 = i;
    }
}

public class Final {
    public static void main(String[] args){
        final Foo obj1 = new Foo(100);

        //コンパイルエラー
        //obj2.num1 = 200;
        //obj1 = new F00(300);

        Foo obj2 = new Foo(300);

        System.out.println("obj1.num1:" + obj1.num1);
        System.out.println("obj1.num2:" + obj1.num2);

    }
}