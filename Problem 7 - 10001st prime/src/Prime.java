/*
 * Problem 7
 *
 * By listing the first six prime numbers:
 * 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10,001st prime number?
 */

public class Prime {
    public static void main(String[] args) {
        System.out.println(new Prime().findPrime(10001));
    }

    private int findPrime(int limit) {
        int answer = 0;
        int primeCount = 0;

        // Begin algorithm at 2 because 1 is not prime
        for(int i = 2; primeCount < limit; i++) {
            boolean isPrime = true;

            for(int j = 2; j < (int) Math.pow(i, 0.5) + 1; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                answer = i;
                primeCount++;
            }
        }
        return answer;
    }
}
