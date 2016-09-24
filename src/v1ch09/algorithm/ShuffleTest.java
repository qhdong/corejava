package v1ch09.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 55));
        int index = Collections.binarySearch(numbers, 55);
        if (index < 0) {
            int insertionPoint = -index - 1;
            numbers.add(insertionPoint, 55);
            System.out.println(numbers);
        }
    }
}
