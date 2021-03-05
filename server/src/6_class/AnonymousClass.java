interface MyInter {

}

class Outer {
    void method(){
        new MyInter(){
            public void methodA(){
                System.out.println("methodA()");
            }
        }.methodA();
    }
}

class AnonymousClass {
    public static void main(String[] args){
        new Outer().method();
    }
}