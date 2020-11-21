import java.awt.Graphics;
import java.awt.event.*;

public class Player extends GameObject {
    public Player() {
        this.x = 300;
        this.y = 300;
        this.width = 50;
        this.height = 50;
    }

    public Bullet shoot() {
        return new Bullet(this.x, this.y);
    }

    public void move(int keycode) {
        switch(keycode) {
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
        }
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, width, height);
    }
}
