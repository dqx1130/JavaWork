package cn.bigdata;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDPServer {
    public static void main(String[] args) throws Exception {
        System.out.println("UDP Server started...");
        // 创建一个DatagramSocket对象，绑定到指定的端口
        DatagramSocket socket = new DatagramSocket(8888);
        // 创建一个字节数组，用于存储接收到的数据
        byte[] buffer = new byte[1024 * 64];
        // 创建一个DatagramPacket对象，用于接收数据包
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        // 接收数据包
        socket.receive(packet);
        // 将接收到的数据转换为字符串
        String message = new String(packet.getData(), 0, packet.getLength());
        // 打印接收到的消息
        System.out.println("Received message: " + message);
        // 关闭DatagramSocket
        socket.close();
    }
}
