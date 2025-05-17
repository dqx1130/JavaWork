package cn.bigdata;
import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;
public class TCPClient {
    public static void main(String[] args){
        try{
            System.out.println("===TCP Client started...===");
            // 创建一个Socket对象，连接到指定的IP地址和端口号
            Socket socket = new Socket("127.0.0.1",7777);
            // 从Socket通信管道中获取字节输入流和字节输出流
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            // 将字节输入流包装成数据输入流，用于后续接收数据
            DataInputStream dis = new DataInputStream(is);
            // 将字节输出流包装成数据输出流，用于后续发送数据
            DataOutputStream dos = new DataOutputStream(os);
            // 发送数据
            dos.writeUTF("Hello, TCP Server!");
            System.out.println("Message sent: Hello, TCP Server!");
            // 接收数据
            String rs = dis.readUTF();
            System.out.println("Message received: " + rs);
            // 关闭Socket
            dis.close();
            dos.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
