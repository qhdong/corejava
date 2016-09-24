package v1ch09.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1993, 3, 20));
        pq.add(LocalDate.of(1966, 5, 1));
        pq.add(LocalDate.of(1968, 9, 1));
        pq.add(LocalDate.of(2016, 9, 27));

        System.out.println("Iterating over elements...");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Removing elements...");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}

