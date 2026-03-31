package ITITIU25044_TrinhTranVinh_Lab03.Problem4_5;

import java.util.*;

public class SchoolDirectory {
    private String directoryName;
    private List<Person> members = new ArrayList<>();

    public SchoolDirectory(String directoryName) {
        this.directoryName = directoryName;
    }
    public void addPerson(Person p) {
        members.add(p);
    }
    public int countStudents() {
        int count = 0;
        for (Person i : members) {
            if (i instanceof Student) ++count;
        }
        return count;
    }
    public int countStaffs() {
        int count = 0;
        for (Person i : members) {
            if (i instanceof Staff) ++count;
        }
        return count;
    }
    public double totalStudentFee() {
        double sum = 0;
        for (Person i : members) {
            if (i instanceof Student s) {
                sum += s.getFee();
            }
        }
        return sum;
    }
    public double totalStaffPay() {
        double sum = 0;
        for (Person i : members) {
            if (i instanceof Staff s) {
                sum += s.getPay();
            }
        }
        return sum;
    }
    public Person findByName(String keyword) {
        for (Person i : members) {
            if (i.getName().equals(keyword)) return i;
        }
        return null;
    }
    public void printAllMembers() {
        for (Person i : members) {
            System.out.print(i);
        }
    }
    public String toString() {
        String l1 = "---School Directory---\n";
        String l2 = "Name: " + directoryName + "\n";
        String l3 = "Members: \n";
        StringBuilder l4 = new StringBuilder();
        for (Person i : members) {
            l4.append(" - ").append(i.getName()).append("\n");
        }
        return l1 + l2 + l3 + l4;
    }
}
