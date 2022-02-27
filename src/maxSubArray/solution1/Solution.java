package maxSubArray.solution1;

import java.util.Arrays;

public class Solution {




    public static void main(String[] args) {
        int[] nums={1, 3, 4, 3, 9, 1};
        int ans=maxSubArray(nums,12);

        System.out.println(ans);
    }

/*123*/

    public static int maxSubArray(int[] nums, int k) {
        int ans=nums[0];

        int l=0,r=0;
        int minLength=nums.length+1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<0){
                l=i;
            }
            nums[i]+=Math.max(0,nums[i-1]);
            if(nums[i]>ans){
                ans=nums[i];
                r=i;
            }
            if(ans>k){
                int ansLength=r-l+1;
                minLength=Math.min(ansLength,minLength);
            }

        }
        return minLength;
    }

}
