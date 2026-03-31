package ITITIU25044_TrinhTranVinh_Lab04;

import ITITIU25044_TrinhTranVinh_Lab04.Problem1.*;

import java.lang.classfile.Attribute;
import java.util.*;

public class TestProblem1 {
    public static void main(String[] ags) {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Student("01", "Name", "name@gmail.com", "Engineering", 2));
        members.add(new Student("02", "Ann", "Ann2308@gmail.com", "Banking", 1));
        members.add(new Staff("03", "Ecuador", "ees1905@gmail.com", "Technology", 2000));
        members.add(new Staff("04", "Ty", "Ty67@gmail.com", "Finance", 2500));

        for (Member i : members) {
            System.out.println(i);
            System.out.println("Role: " + i.getRole());
        }
    }
}
