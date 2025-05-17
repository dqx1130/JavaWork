package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public login() {
        setTitle("QQ");
        setSize(250, 150);
        setLayout(null); // 使用绝对定位
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 用户名标签与文本框
        JLabel userLabel = new JLabel("用户名：");
        userLabel.setBounds(20, 20, 60, 20);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(80, 20, 130, 20);
        add(usernameField);

        // 密码标签与文本框
        JLabel passLabel = new JLabel("密码：");
        passLabel.setBounds(20, 50, 60, 20);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(80, 50, 130, 20);
        add(passwordField);

        // 确定按钮
        JButton confirmButton = new JButton("确定");
        confirmButton.setBounds(40, 85, 70, 25);
        add(confirmButton);

        // 取消按钮
        JButton cancelButton = new JButton("取消");
        cancelButton.setBounds(130, 85, 70, 25);
        add(cancelButton);

        // 事件绑定
        confirmButton.addActionListener(e -> checkLogin());
        cancelButton.addActionListener(e -> System.exit(0));

        setResizable(false); // 禁止缩放
        setVisible(true);
    }

    private void checkLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("123456")) {
            dispose();
            new WelcomeWindow();
        } else {
            JOptionPane.showMessageDialog(this, "用户名或密码错误。", "登录失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    class WelcomeWindow extends JFrame {
        public WelcomeWindow() {
            setTitle("欢迎页面");
            setSize(300, 150);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(new JLabel("欢迎你，" + usernameField.getText() + "！", JLabel.CENTER));
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
