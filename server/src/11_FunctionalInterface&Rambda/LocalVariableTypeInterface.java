import java.util.ArrayList;

public class Foo {

}

public class Test {

    //"var" cannot be used for member variables
    // var a = 100;
    // static var b = 100

    //"var" cannot be used as a method argument
    // public void method(var data){
    public void method(){

        var c = "hello";
        
        // There is no initial value
        // var d;

        //"null" is NG because type inference is not possible
        // var e = null

        final var f = 100;
        var obj = new Foo();
        var list = new ArrayList<>();

        for(var i = 0; i < 10; i++){
            //An explicit type is required for the initial value of the array
            // var ary1 = {10,20};
            var ary2 = new int[] {10,20};
        }
    }
}

public class LocalVariableTypeInterface {
    public static void main(String[] args){

    }
}