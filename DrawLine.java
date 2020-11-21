// package drawline;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class DrawLine {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawLine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        frame.add(canvas);

        frame.setVisible(true);
    }
}

class Canvas extends JPanel implements MouseListener, MouseMotionListener {
    int x = -100;
    int y = -100;
    int currentX;
    int currentY;

    public Canvas() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(600, 400);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawLine(x, y, currentX, currentY);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        currentX = e.getX();
        currentY = e.getY();

        // repaintメソッドの呼び出し
        if(currentX != x || currentY != y) {
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }






}
