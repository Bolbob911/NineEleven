package ITITIU25044_TrinhTranVinh_Lab04.Problem1;

public class Student extends Member {
    private String program;
    private int year;

    public Student(String id, String name, String email, String program, int year) {
        super(id, name, email);
        this.program = program;
        this.year = year;
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

    @Override
    public String getRole() {
        return "Student";
    }
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Program: " + program + ", Year: " + year;
    }
}
