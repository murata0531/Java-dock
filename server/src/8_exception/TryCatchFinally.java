public clss TryCatchFinally {
    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);
        int[] ary = {10,20,30};

        try {
            for(int i = 0; i < num; i++){
                System.out.println("ary : " + ary[i]);
            }
        }catch(ArrayIndexOutOfBounsException e){
            System.out.println("Exception : " + e);
        }finally {
            System.out.println("finally");
        }

        System.out.println("end");
    }
}