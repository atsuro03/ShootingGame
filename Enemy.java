import java.awt.Graphics;

public class Enemy extends GameObject {
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 20;
        this.height = 20;
    }

    public void update() {
        this.y += 1;
    }

    public void draw(Graphics g) {
        if(this.isAlive()) {
            g.drawRect(x, y, width, height);
        }
    }
}
