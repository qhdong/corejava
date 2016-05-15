package v1ch05.inheritance;

import v1ch04.employee.Employee;

/**
 * Test the Manager class
 * @version 1.0
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl", 5000, 1973, 4, 8);
        boss.setBonus(3000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Gogg", 3847, 1989, 4, 5);
        staff[2] = new Employee("Joey", 4300, 1995, 9, 3);

        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
