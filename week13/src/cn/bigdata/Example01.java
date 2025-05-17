package cn.bigdata;

import java.net.InetAddress;

public class Example01 {
    public static void main(String[] args) throws Exception{
        // 获取本地主机的 InetAddress 对象
        InetAddress localAddtress = InetAddress.getLocalHost();
        // 获取主机名为“www.itcast.cn” 的 InetAddress 对象
        InetAddress remoteAddress = InetAddress.getByName("www.itcast.cn");

        System.out.println("本地主机的ip地址：" + localAddtress.getHostAddress());
        System.out.println("itcast的ip地址：" + remoteAddress.getHostAddress());
        System.out.println("3秒内是否可以访问：" + remoteAddress.isReachable(3000));
        System.out.println("itcast的主机名是：" + remoteAddress.getHostName());
    }
}
