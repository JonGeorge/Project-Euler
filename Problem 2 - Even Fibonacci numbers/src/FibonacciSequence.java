/*
 * Problem 2
 *
 * Each new term in the Fibonacci sequence is generated
 * by adding the previous two terms.
 *
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose
 * values do not exceed four million, find the sum of the even-valued terms.
 */
public class FibonacciSequence {

    public static void main(String[] args) {
        FibonacciSequence fib = new FibonacciSequence();
        fib.findSumOfEvenElements(4000000);
    }

    private void findSumOfEvenElements(int limit) {
        int sum = 0;
        int previousTerm = 1;
        int currentTerm = 2;
        boolean limitReached = false;

        while (!limitReached) {

           int nextTerm = previousTerm + currentTerm;

           if(nextTerm < limit) {
               previousTerm = currentTerm;
               currentTerm = nextTerm;

               if (currentTerm % 2 == 0) {
                   sum += currentTerm;
               }

               System.out.println(currentTerm);
           }
           else {
               limitReached = true;
           }
        }
        System.out.println(sum + 2);
    }
}
