/*
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class SumOfMultiples {

    public static void main(String[] args) {
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        sumOfMultiples.findSumOfMultiples();
    }

    private void findSumOfMultiples() {
        int count = 3;
        int sum = 0;

        while (count < 1000) {
            if (count % 3 == 0) {
                sum += count;
            }
            else if (count % 5 == 0){
                sum += count;
            }
            count++;
        }
        System.out.println("Sum: " + sum);
    }
}
