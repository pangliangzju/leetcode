package exchange;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums={5,1,7,4,9,0,2,4,6,4};
        exchange(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void exchange(int[] nums) {
        int n = nums.length;
        int left = 0, right = nums.length - 1;
        while(left<right){
            while (left<right && nums[left]%2==1){
                left++;
            }
            while (left<right && nums[right]%2==0){
                right--;
            }
            swap(nums,left,right);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
