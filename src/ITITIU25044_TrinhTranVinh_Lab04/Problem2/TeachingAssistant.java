package ITITIU25044_TrinhTranVinh_Lab04.Problem2;

import ITITIU25044_TrinhTranVinh_Lab04.Problem1.*;

public class TeachingAssistant extends Student implements Payable {
    private double hourlyRate;
    private int workingHours;

    public TeachingAssistant(String id, String name, String email,
                             String program, int year,
                             double hourlyRate, int workingHours) {
        super(id, name, email, program, year);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * workingHours;
    }
    @Override
    public String getRole() {
        return "Teaching Assistant";
    }
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Hour Rate: " + hourlyRate + "\n"
                + "Working Hours: " + workingHours;
    }

}
