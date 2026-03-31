package ITITIU25044_TrinhTranVinh_Lab03.Problem6;

import java.util.ArrayList;
import java.util.Collections;

public class Project {
    private String projectId;
    private String projectName;
    private double budgetLimit;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Project(String projectId, String projectName, double budgetLimit) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.budgetLimit = budgetLimit;
    }
    public void addEmployee(Employee e) {
        for (Employee i : employees) {
            if (i.getEmployeeId().equals(e.getEmployeeId())) {
                System.out.println("Error: Employee's Id '" + e.getEmployeeId() + "' already exists.");
                return;
            }
        }
        employees.add(e);
    }
    public boolean removeEmployee(String employeeId){
        for (Employee i : employees) {
            if (i.getEmployeeId().equals(employeeId)) {
                return employees.remove(i);
            }
        }
        return false;
    }
    public double estimateWeeklyBudget() {
        double budget = 0;
        for (Employee i : employees) {
            budget += i.calculateWeeklySalary();
        }
        return budget;
    }
    public Employee highestPaidEmployee() {
        Employee highestPaid = null;
        double maxSalary = 0;
        for (Employee i : employees) {
            double salary = i.calculateWeeklySalary();
            if (maxSalary < salary) {
                maxSalary = salary;
                highestPaid = i;
            }
        }
        return highestPaid;
    }
    public int countOfficeEmployees() {
        int count = 0;
        for (Employee i : employees) {
            if (i instanceof OfficeEmployee) {
                ++count;
            }
        }
        return count;
    }
    public int countTravelEmployees() {
        int count = 0;
        for (Employee i : employees) {
            if (i instanceof TravelEmployee) {
                ++count;
            }
        }
        return count;
    }
    public boolean isOverBudget() {
        return budgetLimit < estimateWeeklyBudget();
    }
    public void sortEmployees() {
        Collections.sort(employees);
    }
    public String toString() {
        String l1 = "---Project---\n";
        String l2 = "Id: " + projectId + ", Name: " + projectName + "\n"
                + "Budget: " + budgetLimit + ", Weekly budget used: " + estimateWeeklyBudget() + "\n";
        String l3 = "Highest Paid Employee: " + highestPaidEmployee().getEmployeeName() + "\n";
        String l4 = "Employees: \n";
        StringBuilder l5 = new StringBuilder();
        for (Employee i : employees) {
            l5.append(i);
        }
        return l1 + l2 + l3 + l4 + l5;
    }
}
