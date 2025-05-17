package bigdata;

import javax.swing.*; // 导入用于创建图形界面的Swing库
import java.awt.*; // 导入用于绘图的AWT库

public class star_in_sky_teacher {
    public static void main(String[] args) { // 主方法入口
        JFrame f = new JFrame("Star in the Sky"); // 创建一个JFrame窗口，标题为"Star in the Sky"
        f.setSize(800, 800); // 设置窗口大小为300x400像素
        SPanel mp = new SPanel(); // 创建自定义面板对象
        f.add(mp); // 将面板添加到窗口中
        Thread t = new Thread(mp);
        t.start();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作为退出程序
        f.setVisible(true); // 设置窗口可见
    }
}

class SPanel extends JPanel implements Runnable{
    int x[] = new int[300];
    int y[] = new int[300];

    public SPanel() {
        for (int i = 0; i < 300; i++) {
            x[i] = (int) (Math.random() * 800); // 随机x
            y[i] = (int) (Math.random() * 800); // 随机y
        }
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        for (int i = 0; i < 300; i++) {

            g.drawString("*", x[i],y[i]); // 绘制星星
        }
    }

    @Override
    public void run() {
        while (true) {
            // 每次让星星下落
            for (int i = 0; i < 300; i++) {
                y[i] += 2; // 每次y坐标加2，星星下落
                if (y[i] > 800) { // 如果星星掉出屏幕底部
                    y[i] = 0; // 让星星从顶部重新开始
                    x[i] = (int)(Math.random() * 800); // 随机更改x坐标
                }
            }
            repaint(); // 重绘面板
            try {
                Thread.sleep(30); // 暂停30毫秒，控制星星下落速度
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}