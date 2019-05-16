/**
 * Title: Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long largest = -1;
        long copy = num;
        for (long i = 2; i < Math.sqrt(num); i++) {
            if (copy == 1L) {
                break;
            }
            while (copy % i == 0) {
                copy /= i;
                largest = i;
            }
        }
        System.out.println("Result: " + largest);
    }
}
