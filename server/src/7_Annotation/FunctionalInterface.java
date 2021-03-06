@FunctionalInterface
interface FuncInter<T> {
    void Foo(T t);
    String toString();
    boolean equals(Object obj);
    static void X(){};
    default void Y(){};
}

@FunctionalInterface
interface NotFuncInter<T> {
    boolean equals(Object obj);
}

public class FunctionalInterface {
    public static void main(String[] args) {

    }
}