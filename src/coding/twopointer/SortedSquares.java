package coding.twopointer;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = { -4, -2, 0, 1, 3 };
        int[] squares = makeSquares(nums);

        System.out.println("Sorted squares: " + Arrays.toString(squares));
    }

    private static int[] makeSquares(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        int left = 0, right = n - 1;
        int writeIndex = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                /*
                 * Below operation in seq
                 * 1. results[writeIndex] = leftSq;
                 * 2. writeIndex--;
                 * 3. left++;
                 */
                results[writeIndex--] = leftSq;
                left++;
            } else {
                results[writeIndex--] = rightSq;
                right--;
            }
        }
        return results;
    }
}
