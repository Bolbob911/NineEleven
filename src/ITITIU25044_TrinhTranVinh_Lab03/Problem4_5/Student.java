package ITITIU25044_TrinhTranVinh_Lab03.Problem4_5;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        String l1 = "---Student---\n";
        String l2 = super.toString();
        String l3 = "Program: " + program + ", Year: " + year + "\n";
        String l4 = "Fee: $" + fee + "\n";
        return l1 + l2 + l3 + l4;
    }
}
