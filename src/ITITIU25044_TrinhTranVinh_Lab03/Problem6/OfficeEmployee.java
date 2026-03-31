package ITITIU25044_TrinhTranVinh_Lab03.Problem6;

public class OfficeEmployee extends Employee {
    private double overtimeHours;

    public OfficeEmployee(String id, String name, double salary, int leavingDays, int travelDays, double overtimeHours) {
        super(id, name, salary, leavingDays, travelDays);
        this.overtimeHours = overtimeHours;
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateWeeklySalary() {
        return super.calculateBaseWeeklySalary() + overtimeHours * super.getSalaryPerHour() * 1.5;
    }
    @Override
    public String getRole() {
        return "Office Employee";
    }
}
