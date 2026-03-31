package ITITIU25044_TrinhTranVinh_Lab02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Box
        Box box = new Box(5, 3);
        // Add 3 particles
        for(int i = 0; i < 3; ++i) {
            box.addParticle();
        }
        // Initial box content
        box.visualize();
        System.out.println();

        // Steps
        System.out.print("Enter steps: ");
        int step = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= step; ++i) {
            System.out.println("STEP " + i + ": ");

            // move -> collision check -> visualize
            box.moveStep();
            box.checkCollision();
            box.visualize();

            System.out.println("ENTER to continue...");
            String s = scanner.nextLine();
        }

    }
}
