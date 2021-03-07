public class MultiCatch {
    public static void main(String[] args){

        String s = "A";
        int[] num = {10,0};

        try {
            System.out.println(Integer.parseInt(s));
            System.out.println(num[0] / num[1]);
        }catch(NumberFormatException | ArithmeticException e){
            e.printStackTrace();
            //this is compile error because 'e' is Implicit final
            // e = null;
        }
    }
}