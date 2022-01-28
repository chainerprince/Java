
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket server = new ServerSocket(8000);
            while(true) {
                Socket socket = server.accept();
                InputStream inputStream = socket.getInputStream();
                DataInputStream request = new DataInputStream(inputStream);
                System.out.println(request.readUTF());
                OutputStream output = socket.getOutputStream();
                DataOutputStream response = new DataOutputStream(output);
                response.writeUTF("Hey I received your message");

            }




        }catch (IOException e){
            System.out.println("Server can't connect");



        }



    }
}
