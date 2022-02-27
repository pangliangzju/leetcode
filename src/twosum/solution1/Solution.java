package twosum.solution1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author somnu
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={2,11,15};
        int target=9;
        int[] ans=TwoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] TwoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
