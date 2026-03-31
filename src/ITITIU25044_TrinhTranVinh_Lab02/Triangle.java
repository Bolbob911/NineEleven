package ITITIU25044_TrinhTranVinh_Lab02;

public class Triangle {
    Point2D p1;
    Point2D p2;
    Point2D p3;

    public Triangle(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double perimeter() {
        double d1 = Point2D.distance(p1, p2);
        double d2 = Point2D.distance(p2, p3);
        double d3 = Point2D.distance(p1, p3);
        return (d1 + d2 + d3);
    }
    public double area() {
        double d1 = Point2D.distance(p1, p2);
        double d2 = Point2D.distance(p2, p3);
        double d3 = Point2D.distance(p1, p3);
        double p = perimeter() / 2.0;

        // Heron formula
        return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
    }
    @Override
    public String toString() {
        return "{ " + p1.toString() + ", " + p2.toString() + ", " + p3.toString() + " }";
    }
}
