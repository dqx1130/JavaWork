package cn.bigdata;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPSever {
    public static void main(String[] args){
        try {
            System.out.println("TCP Server started...");
            // 创建一个ServerSocket对象，绑定到指定的端口
            ServerSocket serverSocket = new ServerSocket(7777);
            // 等待客户端连接
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());
            // 从Socket通信管道中获取字节输入流和字节输出流
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            //将字节流包装成数据输入流和数据输出流，用于后续接收数据
            DataInputStream dis = new DataInputStream(is)
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
