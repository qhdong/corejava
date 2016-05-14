package v1ch04;

import v1ch04.employee.Employee;

/**
 * Created by aaron on 16/5/14.
 * @author Dong Qihong
 */
public class ParamTest {
    public static void main(String[] args) {
        int x = 10;
        tripleValue(x);
        System.out.println("x = " + x);

        Employee e = new Employee("Aaron", 100_000_000, 2018, 3, 30);
        tripleSalary(e);
        System.out.println("Salary = " + e.getSalary());
    }

    public static int tripleValue(int x) {
        x = 3 * x;
        return x;
    }

    public static void tripleSalary(Employee e) {
        e.raiseSalary(200);
    }
}
