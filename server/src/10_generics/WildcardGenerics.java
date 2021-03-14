class Gen<T> {

    private T var;

    public Gen(T var){
        this.var = var;
    }

    public T getVar(){
        return var;
    }
}

public class WildcardGenerics {
    public static void main(String[] args){

        int val = Integer.parseInt(args[0]);

        if(val == 1){
            print(new Gen<>(100));
        }else {
           print(new Gen<>("ABC")); 
        }
    }

    static void print(Gen<?> obj){
        System.out.println(obj.getVar());
    }
}