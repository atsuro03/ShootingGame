// package field;

import java.applet.Applet;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.*;

public class Field extends JPanel implements KeyListener, ActionListener {
    private Player player;
    private Bullet bullet;
    private LinkedList<Enemy> enemies = new LinkedList<Enemy>();

    public Field() {
        setSize(600, 400);
        setBackground(Color.white);
        setFocusable(true);
        addKeyListener(this);
        Timer timer = new Timer(20, this);
        timer.start();

        player = new Player();
        bullet = new Bullet(300, 300);
        for(int i = 0; i < 20; i++) {
            enemies.add(new Enemy(i * 30, 20));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.red);
        player.draw(g);
        bullet.draw(g);
        for(Enemy enemy: enemies) {
            enemy.draw(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        player.move(e.getKeyCode());
        if(e.getKeyChar() == 'z') {
            bullet = player.shoot();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bullet.update();
        for(Enemy enemy: enemies) {
            if(enemy.collideWith(bullet)) {
                enemy.delete();
                bullet.delete();
            }
            enemy.update();
        }
        repaint();
    }

}
