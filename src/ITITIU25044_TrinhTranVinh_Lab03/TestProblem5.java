package ITITIU25044_TrinhTranVinh_Lab03;

import ITITIU25044_TrinhTranVinh_Lab03.Problem4_5.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestProblem5 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "3W", "Federal Agent", 4, 10000);
        Student student2 = new Student("Bob", "2′W", "Archaeology", 2, 5000);
        Student student3 = new Student("Fred", "5′E", "Space Engineering", 1, 6000);
        Staff staff1 = new Staff("Professor", "Khu phố 6", "IU", 24000);
        Staff staff2 = new Staff("Janitor", "IU canteen", "IU", 7000);

        SchoolDirectory school = new SchoolDirectory("International University");
        school.addPerson(student1);
        school.addPerson(student2);
        school.addPerson(student3);
        school.addPerson(staff1);
        school.addPerson(staff2);

        System.out.println(school);
        System.out.println("Student count: " + school.countStudents());
        System.out.println("Staff count: " + school.countStaffs());
        System.out.println("Total fee: " + school.totalStudentFee());
        System.out.println("Total pay: " + school.totalStaffPay());
        System.out.println("Search for \"Janitor\": \n" + school.findByName("Janitor"));
    }
}
