package v1ch06.interfaces;

import v1ch06.Employee;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 37500, 1984, 3, 20);
        staff[1] = new Employee("Carl Cracker", 64000, 1998, 5, 20);
        staff[2] = new Employee("John Smith", 57500, 1993, 2, 2);

        Arrays.sort(staff);

        for (Comparable e : staff) {
            System.out.println(e);
        }

    }
}
