import java.io.*;

public class DataXXStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            
            dos.writeInt(100); dos.writeUTF("tanaka"); dos.writeUTF("田中");
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());

        } catch (IOException e) { e.printStackTrace(); }
    }
}
