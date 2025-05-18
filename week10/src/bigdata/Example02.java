package bigdata;
import javax.swing.*;
import java.awt.*;
public class Example02 {
    public static void main(String[] args){
        //创建并设置JFrame窗口的标题
        JFrame frame = new JFrame("JFrameDemo");
        JTextArea textArea = new JTextArea("字体颜色",8, 20);
        JButton bt = new JButton("设置字体颜色");
        JPanel p = new JPanel();        //默认布局，流式布局
        //设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小尺寸
        frame.setSize(300, 230);
        frame.setLocation(400,200);
        p.add(textArea);
        p.add(bt);
        bt.addActionListener(e -> {
            textArea.setForeground(Color.red);
        });
        frame.add(p);
        //设置JFrame为可见
        frame.setVisible(true);
    }
}
