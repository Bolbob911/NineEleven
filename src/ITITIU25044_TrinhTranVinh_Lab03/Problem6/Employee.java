package ITITIU25044_TrinhTranVinh_Lab03.Problem6;

public abstract class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private double salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;


    public Employee(String id, String name, double salary, int leavingDays, int travelDays) {
        employeeId = id;
        employeeName = name;
        salaryPerHour = salary;
        noOfLeavingDay = leavingDays;
        noOfTravelDay = travelDays;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalaryPerHour() {
        return salaryPerHour;
    }
    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }
    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }
    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }
    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    public double calculateBaseWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2.0);
    }
    public abstract double calculateWeeklySalary();
    public abstract String getRole();

    @Override
    public int compareTo(Employee other) {
        if (this.calculateWeeklySalary() != other.calculateWeeklySalary()) {
            return Double.compare(this.calculateWeeklySalary(), other.calculateWeeklySalary());
        }
        else if (this.getNoOfTravelDay() != other.getNoOfTravelDay()) {
            return Integer.compare(this.getNoOfTravelDay(), other.getNoOfTravelDay());
        }
        else if (this.getNoOfLeavingDay() != other.getNoOfLeavingDay()) {
            return Integer.compare(this.getNoOfLeavingDay(), other.getNoOfLeavingDay());
        }
        else return this.getEmployeeName().compareTo(other.getEmployeeName());
    }
    @Override
    public String toString() {
        String l1 = "---Employee---\n";
        String l2 = "Id: " + employeeId + ", Name: " + employeeName + "\n";
        String l3 = "Salary per hour: " + salaryPerHour + "\n";
        String l4 = "Weekly Pay: " + calculateWeeklySalary() + "\n";
        String l5 = "Leaving days: " + noOfLeavingDay + "\n";
        String l6 = "Travel days: " + noOfTravelDay + "\n";
        return l1 + l2 + l3 + l4 + l5 + l6;
    }
}
