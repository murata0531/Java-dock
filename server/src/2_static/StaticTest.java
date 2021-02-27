public class StaticTest {

    //インスタンス変数
    int instanceVal = 0;

    //スタティック変数
    static int staticVal = 1;

    int methodA(){
        return instanceVal;
    }

    int methodB(){
        return staticVal;
    }

    //エラー
    //static int methodC(){ return instanceVal; }

    static int methodD(){
        return staticVal;
    }

    static int methodE(){

        StaticTest obj = new StaticTest();

        return obj.instanceVal;
    }

    public static void main(String[] args){

    }
}