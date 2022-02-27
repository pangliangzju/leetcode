package quickSort.solution1;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums={3,1,5,7,3,9,0,5,6,7};
        String[] strs={"a","b"};
        System.out.println(strs);
        System.out.println(Arrays.asList(strs));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.asList(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums,int start,int end){
        if(start<end){
            int index = getIndex(nums, start, end);

            quickSort(nums,start,index-1);

            quickSort(nums,index+1,end);

        }
    }

    public static int getIndex(int[] nums,int start,int end){
       int pivot=nums[start];

       while(start<end){
           while (start<end && nums[end]>=pivot){
               end--;
           }
           nums[start]=nums[end];
           while (start<end && nums[start]<=pivot){
               start++;
           }
            nums[end]=nums[start];

       }
       nums[start]=pivot;
       return start;
    }

    public static void swap(int[] nums,int a,int b){
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
}
