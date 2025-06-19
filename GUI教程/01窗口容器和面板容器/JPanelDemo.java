import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
public class JPanelDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("Java第二个GUI的程序");
        JPanel jp = new JPanel();
        JLabel jl = new JLabel("这是放在Jpanel上的标签");
        //设置frame的大小
        jf.setBounds(300,100,400,200);
        //设置panel的颜色
        jp.setBackground(Color.pink);
        //把label添加到panel上
        jp.add(jl);
        //把panel添加到frame上
        jf.add(jp);
        //设置frame可见
        jf.setVisible(true);
    }
}
