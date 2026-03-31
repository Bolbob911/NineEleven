package ITITIU25044_TrinhTranVinh_Lab03;
import ITITIU25044_TrinhTranVinh_Lab03.Problem6.*;
import java.util.ArrayList;

public class TestProblem6 {
    public static void main(String[] args) {
        Employee e1 = new OfficeEmployee("01", "Cass", 15, 1, 2, 2);
        Employee e2 = new OfficeEmployee("02", "Leo", 15, 1, 2, 2);
        Employee e3 = new TravelEmployee("03", "Astra", 15, 2, 3, 200);
        Employee e4 = new TravelEmployee("04", "Spain", 20, 0, 5, 300);
        Employee e5 = new TravelEmployee("05", "Sunny", 15, 3, 1, 200);

        Project project = new Project("03A1", "Block Chain", 11000);
        project.addEmployee(e1);
        project.addEmployee(e2);
        project.addEmployee(e3);
        project.addEmployee(e4);
        project.addEmployee(e5);

        project.sortEmployees();
        System.out.println(project.toString());

        // Changing en employee's field
        e4.setNoOfLeavingDay(1);
        e4.setNoOfTravelDay(3);
        e4.setSalaryPerHour(10);
        ((TravelEmployee) e4).setAllowancePerTravelDay(100);

        project.sortEmployees();
        System.out.println(project.toString());
    }
}
