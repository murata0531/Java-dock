import java.io.*;

public class FileXXStream {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fos = new FileOutputStream(new File("data.txt"));
            fos.write(0); fos.write("abc".getBytes()); fos.write(99);
            fis = new FileInputStream(new File("data.txt"));
            int data = 0;

            while((data = fis.read()) != -1){
                System.out.print(data + " "); 
            }

            System.out.println();
            
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        } catch (IOException e) {
            System.err.println("IO Error");
        } finally {
            try { 
                fos.close(); fis.close(); 
            } catch(IOException e) { 
                e.printStackTrace();
            }
        }
    }
}
