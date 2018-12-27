/*
 * Problem 4
 *
 * A palindromic number reads the same both ways.
 *
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class PalindromeProduct {
    public static void main(String[] args) {
        System.out.println(new PalindromeProduct().findLargestProduct());
    }

    private int findLargestProduct() {
        int max = 0;
        int product = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = i; j > 100; j--) {
                product = i * j;
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    private boolean isPalindrome(int number) {

        String numString = Integer.toString(number);

        int lastIndex = numString.length() - 1;

        for (int i = 0; i <= numString.length() / 2; i++) {
            if (!isMatch(numString.charAt(i), numString.charAt(lastIndex - i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMatch(char firstChar, char secondChar) {
        return firstChar == secondChar;
    }
}
