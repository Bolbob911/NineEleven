package ITITIU25044_TrinhTranVinh_Lab03.Problem1_2;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
