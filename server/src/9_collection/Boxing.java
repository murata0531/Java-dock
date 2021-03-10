public class Boxing {
    public static void main(String[] args){

        int i1 = 100;
        //boxing
        Integer obj = i1;
        // unboxing
        int i2 = obj;
        method(i2);
    }

    static void method(Integer obj){
        int i = obj + 100;
        System.out.println(i);
    }
}