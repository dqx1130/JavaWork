package bigdata;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ball {
    public static void main(String[] args){
        JFrame w= new JFrame("球");
        w.setBounds(200,80,220,400);
        BallPanel bp = new BallPanel();
        w.add(bp);
        w.addKeyListener(bp);
        bp.addKeyListener(bp);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}

class BallPanel extends JPanel implements KeyListener{
    int y = 30;
    int x = 80;
    @Override
    public void paint(Graphics g) {
        g.clearRect(0,0,200,400);
        g.fillOval(x,y,30,30);
    }
    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == 37){
            x -= 5;
            repaint();
        }
        if(e.getKeyCode() == 38){
            y -= 5;
            repaint();
        }
        if(e.getKeyCode() == 39){
            x += 5;
            repaint();
        }
        if(e.getKeyCode() == 40){
            y += 5;
            repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e){

    }
}



//class BallPanel extends JPanel implements Runnable{
//    int y = 30;
//    int x = 80;
//    @Override
//    public void paint(Graphics g){
//        g.clearRect(0,0,200,400);
//        g.fillOval(x,y,30,30);
//    }
//    @Override
//    public void run() {
//        while (true) {
//            y += 5;
//            if (y > 400) {
//                y = 30;
//                x = (int) (Math.random() * 200);
//            }
//            repaint();
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//}
