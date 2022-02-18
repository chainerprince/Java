import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ClientUdp {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
//        System.out.println("The server udp");
        DatagramSocket socket = new DatagramSocket();
        String msg = "The thing works and wothe rokllkdsadfjlkjlksdfjalkjsdlkjlkdsjalkjfdsalkjdflkksajlkjdfslk";
        byte[] msgByte = msg.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getAddress());
        DatagramPacket dpmsg = new DatagramPacket(msgByte,msgByte.length,ip,8000);

        socket.send(dpmsg);
        byte[] buffer = new byte[1024];
        DatagramPacket res = new DatagramPacket(buffer,buffer.length);
        socket.receive(res);
        String resString = new String(res.getData(),0,res.getLength());

        System.out.println(resString);


    }
}
