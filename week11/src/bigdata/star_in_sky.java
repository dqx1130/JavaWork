package bigdata;

import javax.swing.*; // 导入用于创建图形界面的Swing库
import java.awt.*; // 导入用于绘图的AWT库

public class star_in_sky {
    public static void main(String[] args) { // 主方法入口
        JFrame f = new JFrame("Star in the Sky"); // 创建一个JFrame窗口，标题为"Star in the Sky"
        f.setSize(2560, 1440); // 设置窗口大小为2K分辨率（2560x1440）
        SkyPanel mp = new SkyPanel(); // 创建自定义面板对象
        f.add(mp); // 将面板添加到窗口中
        Thread t = new Thread(mp); // 创建线程控制星星动画
        t.start();
        f.setBackground(Color.black); // 设置窗口背景颜色为黑色
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作为退出程序
        f.setVisible(true); // 设置窗口可见
    }
}

class SkyPanel extends JPanel implements Runnable {
    int[] x = new int[1000]; // 星星数量加多一点（2K大屏，500颗）
    int[] y = new int[1000];
    int[] size = new int[1000];     // 星星大小
    int[] alpha = new int[1000];    // 星星透明度（闪烁效果）
    int[] alphaChange = new int[1000]; // 控制透明度变化方向

    public SkyPanel() {
        for (int i = 0; i < 1000; i++) {
            x[i] = (int) (Math.random() * 1440);
            y[i] = (int) (Math.random() * 900);
            size[i] = 1 + (int)(Math.random() * 5); // 星星大小：1~3
            alpha[i] = 100 + (int)(Math.random() * 156); // 透明度：100~255
            alphaChange[i] = Math.random() > 0.5 ? 1 : -1; // 随机选择变亮还是变暗
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // 使用2D图形对象，支持透明度
        g2.setColor(Color.black);
        g2.fillRect(0, 0, 2560, 1440); // 填充黑色背景

        for (int i = 0; i < 500; i++) {
            g2.setColor(new Color(255, 255, 255, alpha[i]));
            g2.setFont(new Font("Arial", Font.PLAIN, size[i] * 5));
            g2.drawString("*", x[i], y[i]);
        }
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 500; i++) {
                y[i] += size[i];
                if (y[i] > 1440) {
                    y[i] = 0;
                    x[i] = (int) (Math.random() * 2560);
                }
                alpha[i] += alphaChange[i] * 5;
                if (alpha[i] >= 255) {
                    alpha[i] = 255;
                    alphaChange[i] = -1;
                }
                if (alpha[i] <= 100) {
                    alpha[i] = 100;
                    alphaChange[i] = 1;
                }
            }
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}