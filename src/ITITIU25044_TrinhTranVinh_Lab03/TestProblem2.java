package ITITIU25044_TrinhTranVinh_Lab03;

import ITITIU25044_TrinhTranVinh_Lab03.Problem1_2.*;

public class TestProblem2 {
    public static void main(String[] args){
        Dog d1 = new Dog("Bob");
        Dog d2 = new Dog("Princess");
        Cat c1 = new Cat("Liam");

        System.out.println("Dog 1's name: " + d1);
        System.out.println("Dog 2's name: " + d2);
        System.out.println("Cat's name: " + c1);

        d1.greets();
        d2.greets(d1);
        c1.greets();

        Animal a1 = new Cat("Kitty");
        Animal a2 = new Dog("Buddy");

        Animal[] animals = new Animal[5];
        animals[0] = d1;
        animals[1] = d2;
        animals[2] = c1;
        animals[3] = a1;
        animals[4] = a2;

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i+1) + "'s name: " + animals[i]);
        }
    }
}
