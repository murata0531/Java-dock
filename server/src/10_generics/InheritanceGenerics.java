class Gen<T extends Number> {

    private T var;

    public Gen(T var){
        this.var = var;
    }

    public void display(){
        System.out.println(var);
    }
}

public class InheritanceGenerics {
    public static void main(String[] args){

        Gen<Integer> g1 = new Gen<>(100);
        g1.display();

        Gen<Double> g2 = new Gen<>(3.14);
        g2.display();
    }
}