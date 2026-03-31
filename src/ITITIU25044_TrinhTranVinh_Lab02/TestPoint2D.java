// QUESTION 2 TESTING FILE

package ITITIU25044_TrinhTranVinh_Lab02;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(2, 3);
        Point2D p3 = new Point2D(p2);
        Point2D p4 = new Point2D(-1, 5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        p4.move(4, 4);
        System.out.println(Point2D.distance(p1, p4));
        System.out.println(p2.distance(p3));
    }
}
