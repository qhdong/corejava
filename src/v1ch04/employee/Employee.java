package v1ch04.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A {@code Employee} object represents a employee
 * @author Dong Qihong
 * @version 1.0.0
 * @since version 0.0.1
 * @see v1ch04.employee.EmployeeTest#main(String[])
 */
public class Employee {
    /**
     * the base <strong>ID</strong>, a random number between 0 ~ 1000
     * @see "Core Java"
     */
    private static int nextId;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    private final String name;
    private double salary;
    private final LocalDate hireDay;
    private final int id = assignId();

    /**
     * Constructor function
     * @param name employee's name
     * @param salary the salary
     * @param year the year
     * @param month the month, 1 ~ 12
     * @param day the <em>day</em>
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary, LocalDate hireDay) {
        this(name, salary, hireDay.getYear(), hireDay.getMonthValue(), hireDay.getDayOfMonth());
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary, LocalDate.now());
    }

    private static int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * raise the salary of the employee
     * @param byPercent the percent by which to raise the salary (e.g. 10 means 10%)
     * @return the raised salary
     * @see <a href="http://www.baidu.com/">Reference</a>
     */
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return salary;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Salary: " + getSalary() + ", hireDay: " + hireDay + "]";
    }

    public static List<Employee> getEmployees() {

//        return new ArrayList<Employee>() {{
//                new Employee("Cral", 75000, 1987, 12, 5);
//                new Employee("Garey", 60000, 1987, 1, 20);
//                new Employee("Tommy", 85000, 1993, 6, 5);
//            }};
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Cral", 75000, 1987, 12, 5));
        employees.add(new Employee("Garey", 60000, 1987, 1, 20));
        employees.add(new Employee("Tommy", 85000, 1993, 6, 5));
        return employees;
    }

}
