package v1ch03;

import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }

        double[][] balance = new double[NYEARS][NRATES];
        Arrays.fill(balance[0], 10000);

        for (int i = 1; i < balance.length; i++) {
            for (int j = 0; j < balance[i].length; j++) {
                double oldBalance = balance[i-1][j];
                double interest = oldBalance * interestRate[j];
                balance[i][j] = oldBalance + interest;
            }
        }

        System.out.println("Interest Rates: ");
        for (double rate : interestRate) {
            System.out.printf("%12.0f%%", rate * 100);
        }
        System.out.println();

        for (double[] row : balance) {
            for (double b : row) {
                System.out.printf("%,13.2f", b);
            }
            System.out.println();
        }
    }
}
