public class ArraysClass {
    public static void main(String[] args){

        int[] ary1 = {3,1,2};

        print(ary1);

        Arrays.sort(ary1);

        print(ary1);

        Object[] Ary2 = {"aa",10};

        //class cast exception
        // Arrays.sort(ary2);

    }

    public static void print(int[] ary){
        for(int[] num : ary){
            System.out.print("num" + " ");
        }

        System.out.println();
    }
}