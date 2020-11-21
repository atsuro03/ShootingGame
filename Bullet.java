import java.awt.Graphics;

public class Bullet extends GameObject {
    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 10;
        this.height = 10;
    }

    public void update() {
        this.y -= 5;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, width, height);
    }
}
