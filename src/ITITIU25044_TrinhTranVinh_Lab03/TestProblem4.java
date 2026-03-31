package ITITIU25044_TrinhTranVinh_Lab03;
import ITITIU25044_TrinhTranVinh_Lab03.Problem4_5.Person;
import ITITIU25044_TrinhTranVinh_Lab03.Problem4_5.Staff;
import ITITIU25044_TrinhTranVinh_Lab03.Problem4_5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestProblem4 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "38°53′52″N 77°02′11″W", "Federal Agent", 4, 10000);
        Student student2 = new Student("Bob", "27°07′S 109°22′W", "Archaeology", 2, 5000);
        Staff staff1 = new Staff("Professor", "Khu phố 6, phường Linh Trung, TP. Thủ Đức, Thành phố Hồ Chí Minh", "International University", 24000);
        Staff staff2 = new Staff("Janitor", "IU canteen", "International University", 7000);

        List<Person> persons = new ArrayList<>(Arrays.asList(student1, student2, staff1, staff2));

        for (Person i : persons) {
            System.out.print(i);
        }

        student1.setFee(10000);
        student1.setProgram("Finance");
        student1.setYear(3);
        student1.setAddress("VC Bank");

        staff1.setPay(20000);
        staff1.setSchool("HCMUS");
        staff1.setAddress("227 Nguyễn Văn Cừ, Phường 4, Chợ Quán, Hồ Chí Minh, Việt Nam");

        System.out.println("\nAfter changing fields:");
        for (Person i : persons) {
            System.out.print(i);
        }
    }
}
