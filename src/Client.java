import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{

            Socket socket = new Socket("192.168.",8000);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataOutputStream request = new DataOutputStream(out);
            request.writeUTF("worked");
            InputStream in = socket.getInputStream();
            DataInputStream response = new DataInputStream(in);
            System.out.println("The response is " + response.readUTF());
            socket.close();
        }catch (IOException e){
            System.out.println("The error");
        }
    }
}
