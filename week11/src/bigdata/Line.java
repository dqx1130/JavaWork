package bigdata; // 定义包名

    import javax.swing.*; // 导入用于创建图形界面的Swing库
    import java.awt.*; // 导入用于绘图的AWT库

    public class Line { // 定义主类
        public static void main(String[] args) { // 主方法入口
            JFrame f = new JFrame("Line"); // 创建一个JFrame窗口，标题为"Line"
            f.setSize(300, 400); // 设置窗口大小为300x400像素
            MyPanel mp = new MyPanel(); // 创建自定义面板对象
            f.add(mp); // 将面板添加到窗口中
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作为退出程序
            f.setVisible(true); // 设置窗口可见
        }
    }

    class MyPanel extends JPanel { // 定义自定义面板类，继承JPanel
        public void paint(Graphics g) { // 重写paint方法，用于绘图
            g.drawLine(50, 50, 100, 100); // 绘制一条从(50,50)到(100,100)的直线
            g.drawRect(50,80,120,240); // 绘制一个矩形，左上角坐标为(50,80)，宽度为120，高度为240
            g.setColor(Color.red);// 设置绘图颜色为红色
            g.drawString("*",220,200);
            g.fillOval(200, 50, 50, 50); // 绘制一个填充的椭圆，左上角坐标为(200,50)，宽度和高度均为50
            g.setColor(Color.black);
            //字体类
            Font f = new Font("楷体", Font.BOLD, 20); // 创建一个字体对象，字体为"楷体"，加粗，大小为20
            g.setFont(f); // 设置绘图字体
            g.drawString("Hello World", 220, 150); // 绘制字符串"Hello World"，左下角坐标为(220,150)
        }
    }