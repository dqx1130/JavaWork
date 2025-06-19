import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;

public class CardLayoutDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("Java第五个GUI程序");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        //布局面板选择卡片式布局
        JPanel cards = new JPanel(new CardLayout());
        jp1.add(new JButton("登录"));
        jp1.add(new JButton("注册"));
        jp1.add(new JButton("找回密码"));
        jp2.add(new JTextField("用户名",20));
        jp2.add(new JTextField("密码",20));
        jp2.add(new JTextField("验证码",20));
        //cards面板添加jp1
        cards.add(jp1,"card1");
        //cards面板添加jp2
        cards.add(jp2,"card2");
        //获取 cards 面板当前使用的布局管理器，并将其视为一个 CardLayout 对象，
        // 然后将这个 CardLayout 对象的引用赋值给变量 cl，以便后续可以通过 cl 来操作卡片布局的显示。
        CardLayout cl = (CardLayout)(cards.getLayout());
        //调用show()方法显示jp2
        cl.show(cards,"card1");
        jf.add(cards);
        jf.setBounds(300,200,400,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
