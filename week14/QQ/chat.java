package QQ;
import javax.swing.*;

public class chat extends JFrame{
    public chat() {
        setTitle("聊天框");
        setSize(400,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextArea chating = new JTextArea();
        chating.setBounds(5,5,380,500);
        chating.setEditable(false);
        //滚动
        JScrollPane scrollPane = new JScrollPane(chating);
        scrollPane.setBounds(5,5,380,500);
        add(scrollPane);


        chating.setText("欢迎来到聊天室");
        JTextField input = new JTextField();
        input.setBounds(5,510,300,30);
        add(input);


        JButton sendButton = new JButton("send");
        sendButton.setBounds(310,510,80,30);
        add(sendButton);

        //发送消息功能实例
        sendButton.addActionListener(e -> {
            String text = input.getText();
            if (!text.isEmpty()){
                chating.append("\n我说：" + text );
                input.setText("");
            }
        });
        //回车发送
        input.addActionListener(e -> {
            sendButton.doClick();
        });

        setVisible(true);
    }
    public static void main(String[] args){new QQ.chat();}
}
