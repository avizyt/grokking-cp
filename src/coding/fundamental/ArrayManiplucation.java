package coding.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayManiplucation {

    public static int binarySearch0(int[] a, int fromIndex, int toIndex,
            int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1); // key not found.
    }

    public static void main(String[] args) {
        int[] nums = { 2, 6, 4, 8 };
        Arrays.sort(nums);
        // System.out.println(binarySearch0(nums, 0, nums.length - 1, 4));

        // compare
        // 0 = equal, +ve = first is bigger, -ve = secobd is bigger
        // System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 1 }));

        // creating random array

        ArrayList<Double> randArr = new ArrayList<>();
        int count = 50;
        while (count >= 0) {
            double randInt = Math.random();
            double x = randInt * 2 + Math.random();
            randArr.add(Math.scalb(x, 3));
            count--;

        }
        for (Double num : randArr) {
            System.out.print(num + " ");
        }

    }
}
