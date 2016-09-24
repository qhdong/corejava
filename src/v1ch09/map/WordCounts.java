package v1ch09.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounts {
    public static void main(String[] args) {
        Map<String, Integer> count = new TreeMap<>();
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                long runTime = System.currentTimeMillis();
                count.merge(word, 1, Integer::sum);
                runTime = System.currentTimeMillis() - runTime;
                totalTime += runTime;
            }
        }


        count.forEach((k, v) -> System.out.printf("[%4d] %s%n", v, k));
        System.out.println(count.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
