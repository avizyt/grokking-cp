package coding.twopointer;

/*
 * Given an array of numbers sorted in ascending order and a target sum, 
 * find a pair in the array whose sum is equal to the given target.
 * Write a function to return the indices of the two numbers (i.e. the pair) 
 * such that they add up to the given target. If no such pair exists return [-1, -1].
 * 
 * Time and Space
 * T: O(n) -- Scan fromm both end
 * S: O(1) -- Only two pinter used
 */

public class PairWithTargetSum {
    public static int[] findPair(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 6 };
        int target = 6;
        int[] result = findPair(nums, target);

        System.out.println("Pair indices: " + result[0] + ", " + result[1]);
    }
}
