import javax.swing.*;
import java.awt.*;

public class example04 {
    public static void main(String[] args){
        JFrame jf = new JFrame("华氏温度转换为摄氏温度");
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,2));
        JLabel jl1 = new JLabel("华氏温度");
        JTextField jtf1 = new JTextField();
        JLabel jl2 = new JLabel("摄氏温度");
        JTextField jtf2 = new JTextField();
        JButton jb = new JButton("转换");
        jp.add(jl1);
        jp.add(jtf1);
        jp.add(jl2);
        jp.add(jtf2);
        jp.add(jb);
        jf.add(jp);
        jf.setBounds(200,300,300,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
