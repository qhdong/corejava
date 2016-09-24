package v1ch09.views;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amy", "Bob", "Carl");
        System.out.println(names);
        names = Collections.nCopies(100, "DEFAULT");
        System.out.println(names);
        System.out.println(names.size());
        List<String> students = new ArrayList<>();
        students.addAll(Collections.nCopies(100, "Hello"));
        System.out.println(students);
        Set<String> gender = Collections.singleton("Male");
        System.out.println(gender);
        List<String> group2 = names.subList(10, 20);
        System.out.println(group2);
        ArrayList<String> strings = new ArrayList<>();
        List safeStrings = Collections.checkedList(strings, String.class);
        List rawList = safeStrings;

        rawList.add(new Date());
    }
}
