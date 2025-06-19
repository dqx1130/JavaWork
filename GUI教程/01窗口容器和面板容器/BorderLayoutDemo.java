import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("第三个GUI程序");
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        jf.setSize(400,200);
        //frame 布局方式使用布局管理器
        jf.setLayout(new BorderLayout());
        JButton jb1 = new JButton("上");
        JButton jb2 = new JButton("左");
        JButton jb3 = new JButton("中");
        JButton jb4 = new JButton("右");
        JButton jb5 = new JButton("下");
        jf.add(jb1,BorderLayout.NORTH);
        jf.add(jb2,BorderLayout.WEST);
        jf.add(jb3,BorderLayout.CENTER);
        jf.add(jb4,BorderLayout.EAST);
        jf.add(jb5,BorderLayout.SOUTH);
        jf.add(jb5,BorderLayout.SOUTH);
        //精确控制窗口在屏幕上的起始位置以及它的大小，覆盖setSize
        jf.setBounds(300,200,600,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
