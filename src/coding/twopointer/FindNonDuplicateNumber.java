package coding.twopointer;

public class FindNonDuplicateNumber {

    public static int findNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int writeIndex = 0;
        int i = 0;

        while (i < n) {
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            if (j == i + 1) {
                nums[writeIndex++] = nums[i];
            }
            i = j;
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4, 4, 5 };
        int count = findNonDuplicate(nums);
        System.out.print("Unique sorted subarray: ");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength: " + count);
    }
}
