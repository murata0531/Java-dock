import java.sql.*;

class MyResource implements AutoCloseable {

    private String msg;

    public MyResource(String msg){
        this.msg = msg;
    }

    public void close() throws Exception {
        System.out.println("close() : " + msg);
    }
}

public class TryWithResources {
    public static void main(String[] args){

    }
}