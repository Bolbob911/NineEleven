package ITITIU25044_TrinhTranVinh_Lab03;

import ITITIU25044_TrinhTranVinh_Lab03.Problem1_2.*;

public class TestProblem1 {
    public static void main(String[] args){
        Dog dog = new Dog("Bob");
        Dog pitbull = new Dog("Princess");
        Cat cat = new Cat("Liam");

        dog.greets();
        pitbull.greets(dog);
        cat.greets();

        System.out.println("Dog 1's name: " + dog);
        System.out.println("Dog 2's name: " + pitbull);
        System.out.println("Cat's name: " + cat);
    }
}
