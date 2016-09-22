package v1ch06;

public class Employee extends v1ch04.employee.Employee implements Comparable<Employee>, Cloneable {
    public Employee(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(getSalary(), other.getSalary());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
