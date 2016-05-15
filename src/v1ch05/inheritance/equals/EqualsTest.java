package v1ch05.inheritance.equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice", 75000, 1987, 12, 31);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice", 75000, 1987, 12, 31);
        Employee bob = new Employee("Bob", 50000, 1993, 4, 2);

        // alice1 与 alice2 引用相同的地址,所以相同
        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl", 80000, 1988, 10, 1);
        Manager boss = new Manager("Boss", 98000, 1968, 3, 1);
        boss.setBonus(20000);
        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
    }
}
