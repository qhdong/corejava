package v1ch09.map;

import v1ch04.employee.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("183-5195-1918", new Employee("Dong", 19191, 1993, 3, 20));
        staff.put("181-5195-1918", new Employee("Qihong", 19191, 1993, 3, 20));
        staff.put("180-5195-1918", new Employee("Mike", 19191, 1993, 3, 20));

        System.out.println(staff);

        staff.remove("183-5195-1918");
        staff.replace("180-5195-1918", new Employee("JiaoJiao", 22323, 1992, 4, 14));

        System.out.println(staff.get("181-5195-1918"));

        staff.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
//        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
//            String k = entry.getKey();
//            Employee v = entry.getValue();
//            System.out.println(k);
//            System.out.println(v);
//        }
        staff.entrySet().forEach(System.out::println);

        staff.values().forEach(System.out::println);

        staff.keySet().forEach(System.out::println);
    }
}
