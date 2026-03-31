package ITITIU25044_TrinhTranVinh_Lab04.Problem1;

import ITITIU25044_TrinhTranVinh_Lab04.Problem2.*;

public class Staff extends Member implements Payable {
    private String department;
    private double baseSalary;

    public Staff(String id, String name, String email, String department, double baseSalary) {
        super(id, name, email);
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePayment() {
        return baseSalary;
    }
    @Override
    public String getRole() {
        return "Staff";
    }
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Department: " + department + ", Base salary: " + baseSalary;
    }
}
