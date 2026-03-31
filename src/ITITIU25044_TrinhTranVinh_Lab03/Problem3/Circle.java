package ITITIU25044_TrinhTranVinh_Lab03.Problem3;

public class Circle extends Shape {
    private double radius;
    private static double pi = 3.14159265359;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * pi * radius;
    }
    @Override
    public String toString() {
        String l1 = "---Circle---\n";
        String l2 = super.toString();
        String l3 = "Radius: " + radius + "\n";
        String l4 = "Perimeter: " + getPerimeter() + "\n";
        String l5 = "Area: " + getArea() + "\n";
        return l1 + l2 + l3 + l4 + l5;
    }
}
