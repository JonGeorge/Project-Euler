import java.math.BigInteger;
/*
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Notes: Implemented using BigInteger to allow numbers outside the range of
 *        the 'long' data type to be used
 *        [-9,223,372,036,854,775,808, +9,223,372,036,854,775,807]
 */
public class PrimeFactorFinder {
    public static void main(String[] args) {
        PrimeFactorFinder factorFinder = new PrimeFactorFinder();
        factorFinder.findPrimeFactors(new BigInteger("600851475143"));
    }

    private void findPrimeFactors(BigInteger num) {

        for (BigInteger factor = new BigInteger("2");
             num.compareTo(factor) == 1;
             factor = factor.add(BigInteger.ONE))
        {
            while (num.mod(factor).equals(new BigInteger("0"))) {
                System.out.println(factor.toString());
                num = num.divide(factor);
            }
        }

        if (num.compareTo(new BigInteger("2")) == 1) {
            System.out.println(num.toString());
        }
    }
}
