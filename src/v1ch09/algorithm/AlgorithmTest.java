package v1ch09.algorithm;

import v1ch04.employee.Employee;

import java.util.*;

public class AlgorithmTest {
    private static Random random = new Random();
    private static final int BOUND = 1000;

    public static void main(String[] args) {
        ArrayList<Double> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(Math.random() * 1000);
        }
        System.out.println(v);
        System.out.println(Algorithm.max(v));
        List<Employee> employees = Employee.getEmployees();
        System.out.println(employees);
        employees.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employees);
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println(employees);

        List<Integer> a = generateRandomList(100);
        List<Integer> b = generateRandomList(100);
        System.out.println(a);
        System.out.println(b);
        List<Integer> interSections = new ArrayList<>(a);
        interSections.retainAll(b);
        System.out.println(interSections);

        Integer[] arrays = a.toArray(new Integer[0]);
        System.out.println(arrays);

    }

    public static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(BOUND));
        }
        return list;
    }
}
