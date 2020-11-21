import java.awt.Graphics;
import java.lang.Object;

public class GameObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public void delete() {
        this.isAlive = false;
    }

    public boolean collideWith(GameObject object) {
        if(!object.isAlive()) {
            return false;
        }
        if(this == object) {
            return false;
        }
        return x < object.x + object.width && object.x < x + width && y < object.y + object.height && object.y < y + height;
    }

    public void update() {

    }

    public void draw(Graphics g) {

    }
}
