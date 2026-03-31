package ITITIU25044_TrinhTranVinh_Lab03.Problem3;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        String l1 = "---Rectangle---\n";
        String l2 = super.toString();
        String l3 = "Width: " + width + "\n";
        String l4 = "Length: " + length + "\n";
        String l5 = "Perimeter: " + getPerimeter() + "\n";
        String l6 = "Area: " + getArea() + "\n";
        return l1 + l2 + l3 + l4 + l5 + l6;
    }
}
