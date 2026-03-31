package ITITIU25044_TrinhTranVinh_Lab02;
import java.util.Scanner;

public class Point2D {
    int x;
    int y;

    public Point2D(){};
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        scanner.close();
    }
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isOrigin() {
        return (x != 0 || y != 0);
    }
    public double distance(Point2D p) {
        return (Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2)));
    }
    public static double distance(Point2D p1, Point2D p2) {
        return (Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
