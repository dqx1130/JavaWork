import javax.swing.*;
import java.awt.*;
public class JFrameDemo extends JFrame{
    public JFrameDemo(){
        setTitle("Java 第一个窗口程序");
        //设置窗口大小
        setSize(400,200);
        //设置窗口可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个标签
        JLabel jl = new JLabel("这是使用JFrame类创建的标签");
        //获取当前窗口的内容窗格
        Container c = getContentPane();
        c.add(jl);
        setVisible(true);
    }
    public static void main(String[] args){
        new JFrameDemo();
    }
}