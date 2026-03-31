package ITITIU25044_TrinhTranVinh_Lab04;

import ITITIU25044_TrinhTranVinh_Lab04.Problem1.*;
import ITITIU25044_TrinhTranVinh_Lab04.Problem2.*;

import java.util.ArrayList;

public class TestProblem2 {
    public static void main(String[] args) {
        ArrayList<Payable> members = new ArrayList<>();
        members.add(new TeachingAssistant("01", "Name", "name@gmail.com", "Engineering", 2, 75, 4));
        members.add(new TeachingAssistant("02", "Ann", "Ann2308@gmail.com", "Banking", 1, 50, 5));
        members.add(new Staff("03", "Ecuador", "ees1905@gmail.com", "Technology", 2000));

        for (Payable i : members) {
            System.out.println(i);
            System.out.println("Salary: " + i.calculatePayment());
        }
    }
}
