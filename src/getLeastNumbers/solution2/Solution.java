package getLeastNumbers.solution2;

import java.util.Arrays;

/**
 * @author somnu
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={5,65,3,0,98,1,5,45};

        System.out.println(Arrays.toString(getLeastNumbers(nums,4)));
    }

    public static int[] getLeastNumbers(int[] nums, int k) {

        if (nums.length <= k ||nums==null) {
            return nums;
        }
        return quickSort(nums, 0, nums.length - 1, k);
    }

    public static int[] quickSort(int[] nums, int l, int r, int k) {

        int i = l, j = r;
        while (i < j) {
            while (i < j && nums[j] >=nums[l]) {
                j--;
            }
//            先动j再动i，是小于等于就可以不管，不是小于
            while (i < j && nums[i] <= nums[l]) {
                i++;
            }

            swap(nums, i, j);
        }
        swap(nums, l, i);
        if (i > k) {
            return quickSort(nums, l, i - 1, k);
        }
        if (i < k) {
            return quickSort(nums, i + 1, r, k);
        }
        return Arrays.copyOf(nums, k);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
