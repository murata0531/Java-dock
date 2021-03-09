class Test {
    private int check(int point){
        assert (point > 0) : "Illegal value : " + point;
        return point * 100;
    }

    int method(int point){
        return check(point);
    }
}

public class AssersionError {
    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.method(10));
        System.out.println(obj.method(-1));
    }
}