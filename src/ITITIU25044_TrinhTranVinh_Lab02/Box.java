package ITITIU25044_TrinhTranVinh_Lab02;
import java.util.ArrayList;
import java.util.Random;

public class Box {
    private int particleCount = 0;
    private final int width;
    private final int height;
    ArrayList<Particle> particles = new ArrayList<>();


    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void addParticle() {
        Random random = new Random();

        // Initialize random position
        int x, y;
        boolean blank;
        do {
            blank = true;
            x = random.nextInt(width);
            y = random.nextInt(height);
            for (Particle i : particles) {
                if (x == i.getPositionX() && y == i.getPositionY()) {
                    blank = false;
                }
            }
        } while (!blank); // avoid occupied position

        // Initialize random ID
        int id;
        boolean exists;
        do {
            exists = false;
            id = random.nextInt(128); // Generate ID from 0-127
            for (Particle i : particles) {
                if (i.getID() == id) {
                    exists = true;
                }
            }
        } while (exists);

        // Create particle
        Particle p = new Particle(id, x, y);
        particles.add(p);
        ++particleCount;
    }
    public void removeParticle(int index) {
        particles.remove(index);
        --particleCount;
    }
    public void moveStep() {
        for (Particle i : particles) {
            i.moveRandom(width, height);
        }
    }
    public void checkCollision() {
        for (int i = 0; i < particleCount; ++i) {
            for (int j = i + 1; j < particleCount; ++j) {
                if (particles.get(i).getPositionX() == particles.get(j).getPositionX()
                && particles.get(i).getPositionY() == particles.get(j).getPositionY()) {
                    System.out.println("Particle " + particles.get(i).getID()
                                    + " & particle " + particles.get(j).getID()
                                    + " collided at " + particles.get(i));
                    System.out.println("Remove particle " + particles.get(j).getID());
                    removeParticle(j);
                    addParticle();
                    --j; // to continue the array because remove() shift it to the left by 1
                }
            }
        }
    }
    public void visualize() {
        for (int i = 0; i < width; ++i) {
            System.out.print("--- ");
        }
        System.out.println();

        // Visualize box (* == empty, O == particle)
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                boolean printBlank = true;
                for(Particle p : particles) {
                    if (p.getPositionX() == j && p.getPositionY() == i) {
                        System.out.print(" O  ");
                        printBlank = false;
                    }
                }
                if (printBlank) {
                    System.out.print(" *  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < width; ++i) {
            System.out.print("--- ");
        }
        System.out.println();

        // print particles' ID & coordinates
        System.out.println("Particles: " + particleCount);
        System.out.print("Coordinates: ");
        for (Particle i : particles) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }
}
