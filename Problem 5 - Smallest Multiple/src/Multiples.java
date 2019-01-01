/*
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from
 * 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */

public class Multiples {
    public static void main(String[] args) {
        System.out.println(new Multiples().lcm(20));
    }

    private long lcm(long limit) {
        long lcm = 1;

        for(long i = 1; i < limit; i++) {
            lcm = (lcm * i) / (gcf(i, lcm));
        }
        return lcm;
    }

    private long gcf(long x, long y) {
        if(x % y != 0) {
            return gcf(y, x % y);
        }
        else {
            return y;
        }
    }
}