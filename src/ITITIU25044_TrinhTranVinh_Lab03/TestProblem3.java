package ITITIU25044_TrinhTranVinh_Lab03;

import ITITIU25044_TrinhTranVinh_Lab03.Problem3.*;

public class TestProblem3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, "red", true);
        Rectangle r1 = new Rectangle(5, 6, "blue", false);
        Square s1 = new Square(2, "yellow", true);

        System.out.println(c1);
        System.out.println(r1);
        System.out.println(s1);

        s1.setSide(3);
        System.out.println("After changing the square's side to 3\n" + s1);

        s1.setLength(5);
        System.out.println("After changing the square's length to 5\n" + s1);

        s1.setWidth(2);
        System.out.println("After changing the square's width to 2\n" + s1);
    }
}
