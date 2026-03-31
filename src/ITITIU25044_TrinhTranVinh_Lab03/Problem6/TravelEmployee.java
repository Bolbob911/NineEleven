package ITITIU25044_TrinhTranVinh_Lab03.Problem6;

public class TravelEmployee extends Employee {
    private double allowancePerTravelDay;

    public TravelEmployee(String id, String name, double salary, int leavingDays, int travelDays, double allowance) {
        super(id, name, salary, leavingDays, travelDays);
        allowancePerTravelDay = allowance;
    }
    public double getAllowancePerTravelDay() {
        return allowancePerTravelDay;
    }
    public void setAllowancePerTravelDay(double allowance) {
        this.allowancePerTravelDay = allowance;
    }

    @Override
    public double calculateWeeklySalary() {
        return super.calculateBaseWeeklySalary() + super.getNoOfTravelDay() * allowancePerTravelDay;
    }
    @Override
    public String getRole() {
        return "Travel Employee";
    }
}
