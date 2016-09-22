package v1ch06;

import java.util.Arrays;

public class Clonable {
    public static void main(String[] args) {
        int[] luckyNumbers = {2, 3, 5, 8, 13};
        int[] cloned = luckyNumbers.clone();
        cloned[0] = -99;
        System.out.println(Arrays.toString(luckyNumbers));
    }
}
