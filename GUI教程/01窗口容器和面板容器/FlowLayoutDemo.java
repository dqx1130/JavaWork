import javax.swing.*;
import java.awt.*;
public class FlowLayoutDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("Java第四个GUI程序");
        JPanel jp = new JPanel();
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        jp.add(jb6);
        jp.add(jb7);
        jp.add(jb8);
        jp.add(jb9);
        //Panel设置流式布局,组件间的横向和纵向间隙都设置为20像素
        jp.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        //设置背景色
        jp.setBackground(Color.pink);
        //添加面板到容器
        jf.add(jp);
        //设置容器大小
        jf.setBounds(300,200,300,150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
