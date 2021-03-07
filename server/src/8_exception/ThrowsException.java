class MyException extends Exception {

    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

public class ThrowsException {
    public static void main(String[] args){

        try {
            int age = -1;
            checkAge(age);
        }catch(MyException e){
            System.out.println("Illegal Value : " + e.getAge());
        }
    }

    public static void checkAge(int age) throws MyException {

        if(age >= 0){
            System.out.println("ok");
        }else {
            MyException e = new MyException();
            e.setAge(age);
            throw e;
        }
    }

}