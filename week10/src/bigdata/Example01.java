package bigdata;
import javax.swing.*;
import java.awt.*;

public class Example01 {
    public static void main(String[] args) {
        //创建并设置JFrame窗口的标题
        JFrame frame = new JFrame("JFrameDemo");
        JLabel label = new JLabel("UserName");
        JTextField tf= new JTextField(20);
        JButton bt = new JButton("OK！");
        JPanel p = new JPanel();        //默认布局，流式布局
        //设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小尺寸
        frame.setSize(300, 200);
        frame.setLocation(700,200);
        //设置JFrame为可见
//        frame.add(bt, BorderLayout.SOUTH);
//        frame.add(new JButton("East") , BorderLayout.EAST);
//        frame.add(new JButton("West") , BorderLayout.WEST);
//        frame.add(new JButton("center"), BorderLayout.CENTER);
//        frame.add(label,BorderLayout.NORTH);
        frame.setLayout(null);
//        bt.setBounds(50,50,100,30);
//
//        label.setBounds(50,150,100,50);

//        FlowLayout f1 = new FlowLayout();
//        frame.setLayout(f1);
        p.add(bt);
        p.add(tf);
        p.add(label);
        frame.add(p);
        frame.setVisible(true);
    }
}
