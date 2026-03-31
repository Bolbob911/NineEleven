package ITITIU25044_TrinhTranVinh_Lab02;
import java.util.Random;

public class Particle {
    private int id;
    private Point2D p;

    public Particle() {};
    public Particle(int id, int x, int y) {
        p = new Point2D(x, y);
        this.id = id;
    }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public int getPositionX() {
        return p.x;
    }
    public int getPositionY() {
        return p.y;
    }
    public void moveRandom(int boundWidth, int boundHeight) {
        Random random = new Random();
        int randomX, randomY;
        do {
            // Move in 8 directions by 1 cell
            randomX = random.nextInt(3) - 1;
            randomY = random.nextInt(3) - 1;

            // Bound x position to (0, width - 1)
            if ((p.x + randomX) > boundWidth - 1) {
                --randomX;
            } else if ((p.x + randomX) < 0) {
                ++randomX;
            }

            // Bound y position to (0, height - 1)
            if ((p.y + randomY) > boundHeight - 1) {
                --randomY;
            } else if ((p.y + randomY) < 0) {
                ++randomY;
            }

        } while (randomX == 0 && randomY == 0); // avoid not moving

        p.x += randomX;
        p.y += randomY;
    }
    @Override
    public String toString() {
        return "id: " + id + " " + p.toString();
    }
}
