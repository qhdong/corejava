package v1ch05.inheritance.arrayList;

import v1ch04.employee.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Aaron", 800_000_000, 2019, 10, 10));
        staff.add(new Employee("Backman", 735_000_000, 2015, 5, 10));

        for (Employee e : staff) {
            e.raiseSalary(5.4);
            System.out.println(e);
        }
    }
}
