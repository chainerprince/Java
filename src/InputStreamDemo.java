import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStreamDemo {
    public  static  void main(String[] args){
        FileInputStream inputStream = null;
        FileOutputStream outStream = null;
        int character;
        try {
            inputStream = new FileInputStream(new File("work.txt"));
            outStream = new FileOutputStream(new File("workCopy.txt"));
            while((character = inputStream.read()) != -1){
                outStream.write(character);
//                System.out.print((char)character);

            }
        }
        catch (Exception err){
            err.printStackTrace();
        }
//        finally {
//            inputStream.close();
//        }
    }

}
