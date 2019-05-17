/**
 * Title: Summation of primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public long solve() {
        long result = 0;

        for (int i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }
        return result;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long result = new Problem10().solve();
        System.out.println("Result: " + result);
    }
}
