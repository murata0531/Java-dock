public class Static {

    //インスタンス変数
    int instanceVal;

    //スタティック変数
    static int staticVal;

    int methodA(){
        return instanceVal;
    }

    int methodB(){
        return staticVal;
    }
}