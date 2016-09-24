package v1ch08;

import java.io.Serializable;
import java.time.LocalDate;

public class PairTest {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        System.out.println("middle = " + ArrayAlg.getMiddle(words));
        test2();
    }

    public static void test2() {
        LocalDate[] birthdays = {
                LocalDate.of(1993, 3, 20),
                LocalDate.of(1989, 5, 21),
                LocalDate.of(1964, 5, 1),
                LocalDate.of(1966, 9, 1)
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg {
    public static <T extends Comparable & Serializable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (T item : a) {
            if (min.compareTo(item) > 0) min = item;
            if (max.compareTo(item) < 0) max = item;
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
