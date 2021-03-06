@FuncionalInterface
interface FuncInter<T> {
    void Foo(T t);
    String toString();
    boolean equals(Object obj);
    static void X();
    default void Y();
}

public class FuncionalInterface {
    public static void main(String[] args) {
        
    }
}