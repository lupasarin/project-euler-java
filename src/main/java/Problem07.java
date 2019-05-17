/**
 * Title: 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
public class Problem7 {
    public int solve() {
        int primeCount = 0;
        int current = 1;
        while (primeCount < 10001) {
            current++;
            if (isPrime(current)) {
                primeCount++;
            }
        }
        return current;
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
        int result = new Problem7().solve();
        System.out.println("Result: " + result);
    }
}
