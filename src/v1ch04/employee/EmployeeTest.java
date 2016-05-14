package v1ch04.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Cral", 75000, 1987, 12, 5);
        staff[1] = new Employee("Garey", 60000, 1987, 1, 20);
        staff[2] = new Employee("Tommy", 85000, 1993, 6, 5);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(e);
        }

        Employee employee = new Employee(2000);
        System.out.println(employee);
    }
}
