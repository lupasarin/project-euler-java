/**
 * Title: Largest palindrome product
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public int solve() {
        int result = -1;

        for (int num1 = 999; num1 > 99; num1--) {
            for (int num2 = 999; num2 > 99; num2--) {
                int product = num1 * num2;
                if (isPalindromic(product) && product > result) {
                    result = product;
                }
            }
        }
        return result;
    }

    private boolean isPalindromic(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int result = new Problem4().solve();
        System.out.println("Result: " + result);
    }
}
