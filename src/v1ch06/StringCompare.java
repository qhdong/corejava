package v1ch06;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Tommy", "Jack", "Gosling"};
        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
