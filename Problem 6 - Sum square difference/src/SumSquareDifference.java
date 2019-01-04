import java.lang.Math;

/*
 * Problem 6
 *
 *The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.printf("%.0f", new SumSquareDifference()
                .computeSumSquareDifference(100));
    }

    private double computeSumSquareDifference(int limit) {
        return squareSum(limit) - sumSquare(limit);
    }

    private double squareSum(int limit) {
        double sum = 0;

        for(int i = 1; i <= limit; i++) {
            sum = sum + i;
        }

        return Math.pow(sum, 2);
    }

    private double sumSquare(int limit) {
        double sum = 0;

        for(int i = 1; i <= limit; i++) {
            sum = sum + Math.pow(i, 2);
        }

        return sum;
    }
}
