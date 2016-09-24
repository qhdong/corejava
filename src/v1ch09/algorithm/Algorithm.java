package v1ch09.algorithm;

import java.util.*;

public class Algorithm {
    public static <T extends Comparable<T>> T max(T[] a) {
        if (a.length == 0) throw new NoSuchElementException();
        T largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (largest.compareTo(a[i]) < 0)
                largest = a[i];
        }
        return largest;
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> v) {
        if (v.size() == 0) throw new NoSuchElementException();
        T largest = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            if (largest.compareTo(v.get(i)) < 0)
                largest = v.get(i);
        }
        return largest;
    }

    public static <T extends Comparable<T>> T max(LinkedList<T> l) {
        if (l.size() == 0) throw new NoSuchElementException();
        Iterator<T> iter = l.iterator();
        T largest = iter.next();
        while (iter.hasNext()) {
            T next = iter.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }

    public static <T extends Comparable<T>> T max(Collection<T> c) {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext()) {
            T next = iter.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }
}
