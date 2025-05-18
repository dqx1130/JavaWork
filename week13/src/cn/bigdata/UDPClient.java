package cn.bigdata;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPClient {
    public static void main(String[] args) throws Exception {
        System.out.println("UDP Client started...");
        // 创建一个DatagramSocket对象，指定发送端口
        DatagramSocket socket = new DatagramSocket(7777);
        // 创建要发送的消息
        String message = "Hello, UDP Server!";
        // 将消息转换为字节数组
        byte[] buffer = message.getBytes();
        // 创建一个DatagramPacket对象，用于发送数据包
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
        // 发送数据包
        socket.send(packet);
        // 关闭DatagramSocket
        System.out.println("Message sent: " + message);
        socket.close();
    }
}
