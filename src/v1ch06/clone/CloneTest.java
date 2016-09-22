package v1ch06.clone;

import v1ch06.Employee;

/**
 * Created by aaron on 16-9-21.
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John Q. Public", 5000_000, 2016, 3, 2);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            System.out.println("original: " + original);
            System.out.println("copy: " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
