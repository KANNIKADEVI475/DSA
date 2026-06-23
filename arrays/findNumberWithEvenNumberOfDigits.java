
package arrays;

public class findNumberWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int num : nums) {
            if (num == 0) continue; // 0 has 1 digit (odd)
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}
