package v1ch09;

import v1ch04.employee.Employee;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<WeekDay> always = EnumSet.allOf(WeekDay.class);
        EnumSet<WeekDay> workday = EnumSet.range(WeekDay.MON, WeekDay.FRI);
        System.out.println(always);
        System.out.println(workday);

        EnumMap<WeekDay, Employee> personInCharge = new EnumMap(WeekDay.class);
        personInCharge.put(WeekDay.FRI, new Employee("Dong", 30_000*30_000, 2017, 9, 23));
        System.out.println(personInCharge);
    }
}

enum WeekDay {
    MON, TUE, WED, THU, FRI, SAT, SUN
}