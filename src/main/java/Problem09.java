/**
 * Title: Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem09 {
    public int solve() {

        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int cSquare = a*a + b*b;
                double c = Math.sqrt(cSquare);

                if (c - (int)c == 0 && a+b+c == 1000) {
                    return a*b*(int)c;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = new Problem09().solve();
        System.out.println("Result: " + result);
    }
}
