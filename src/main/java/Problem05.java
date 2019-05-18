import java.util.HashMap;
import java.util.Map;

/**
 * Title: Smallest multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem05 {
    public int solve() {
        Map<Integer, Integer> factors = new HashMap<>();

        for (int i = 2; i <= 20; i++) {
            Map<Integer, Integer> factorsForNum = getFactors(i);
            for (Map.Entry<Integer, Integer> entry : factorsForNum.entrySet()) {
                Integer oldExponent = factors.get(entry.getKey());
                if (oldExponent == null || entry.getValue() > oldExponent) {
                    factors.put(entry.getKey(), entry.getValue());
                }
            }
        }
        int result = 1;
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            result *= Math.pow(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private Map<Integer, Integer> getFactors(int num) {
        int copy = num;
        Map<Integer, Integer> result = new HashMap<>();
        int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        for (int i : primeNumbers) {
            if (copy % i == 0) {
                int exponent = (int)(Math.log(copy) / Math.log(i));
                result.put(i, exponent);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10 -> 2,3,2^2,5,2*3,7,2^3,3^2,2*5
        // 2^3,3^2,5,7 -> 8*9*5*7 = 2520
        int result = new Problem05().solve();
        System.out.println("Result: " + result);
    }
}
