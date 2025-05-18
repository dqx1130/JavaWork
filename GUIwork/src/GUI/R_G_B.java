package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class R_G_B{
    static int r = 0 , g = 0 , b = 0;
    public static void main(String[] args) {
        JFrame w = new JFrame("RGB");
        w.setBounds(220, 160, 320, 240);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(null);

        JPanel p = new JPanel();
        p.setBounds(0, 0, 320, 240);
        p.setBackground(new Color(r, g, b));
        w.add(p);

        JButton redButton = new JButton("Red + 10");
        redButton.setBounds(20, 80, 80, 40);
        p.add(redButton);


        JButton greenButton = new JButton("绿+10");
        greenButton.setBounds(120, 80, 80, 40);
        p.add(greenButton);

        JButton blueButton = new JButton("蓝+10");
        blueButton.setBounds(220, 80, 80, 40);
        p.add(blueButton);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r += 10;
                if (r > 255) r = 0;
                p.setBackground(new Color(r, g, b));
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g += 10;
                if (g > 255) g = 0;
                p.setBackground(new Color(r, g, b));
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b += 10;
                if (b > 255) b = 0;
                p.setBackground(new Color(r, g, b));
            }
        });

        w.setVisible(true);
    }
}

