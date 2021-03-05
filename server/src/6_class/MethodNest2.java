//outer class
class Outer {

    private int num = 100;

    //non-static class
    class A {

        public int num = 200;

        void method(int num) {

            num += 1;
            this.num += 1;
            Outer.this.num += 1;

            System.out.println("num : " + num);
            System.out.println("this.num : " + this.num);
            System.out.println("Outer.this.num : " + Outer.this.num);

        }
    }
}

//outer class
public class  MethodNest2 {
    public static void main(String[] args){
        new Outer().new A().method(300);
    }
}