package v1ch03;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] primes = new int[10];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = i+1;
        }

        for (int prime : primes) {
            System.out.println(prime);
        }

        int[] numbers = {1993, 2001, 3847};
        System.out.println(Arrays.toString(numbers));
        numbers = Arrays.copyOf(numbers, 2*numbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
