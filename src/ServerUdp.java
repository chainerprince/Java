import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ServerUdp {
    public static void main(String[] args) throws  IOException  {
     DatagramSocket socket = new DatagramSocket(8000);
     while(true){
         byte[] buffer = new byte[1024];
         DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
         socket.receive(packet);
         String req = new String(packet.getData(),0, packet.getLength());
         System.out.println(req);
         InetAddress ip = packet.getAddress();
         int port = packet.getPort();
         String res = "Well received sakdfljlkjflas fkjaljfl asl;jfl;jlk;jlk;dsjfl;jldsfkjfdssljlk";
         byte[] responseByte = res.getBytes();
         DatagramPacket responsePacket = new DatagramPacket(responseByte,responseByte.length,ip,port);
         socket.send(responsePacket);

     }




    }
}
