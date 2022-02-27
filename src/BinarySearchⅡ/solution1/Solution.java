package BinarySearchⅡ.solution1;

public class Solution {
    public int search (int[] nums, int target) {
        // write code here
        int l=0,r=nums.length-1;
        int equa=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                equa=mid;
                break;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        while(equa>0 && nums[equa-1]==nums[equa]){
            equa--;
        }
        return equa;
    }
    public int[] x(){
        return new int[]{-1,-1};
    }
}
