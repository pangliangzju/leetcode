package getLeastNumbers.solution1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums={3,1,4,5,2};
        System.out.println(Arrays.toString(getLeastNumbers(nums,2)));
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        if(arr==null || arr.length<=k){
            return arr;
        }
        return quickSort(arr,0,arr.length-1,k);
    }
    public static int[] quickSort(int[] arr,int l,int r,int k){
        int i=l,j=r;
        while(i<j){
            while(i<j && arr[i]<=arr[l]){
                i++;
            }
            while(i<j && arr[j]>=arr[l]){
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,l,i);
        if(i>k){
            return quickSort(arr,l,i-1,k);
        }
        if(i<k){
            return quickSort(arr,i+1,r,k);
        }
        return Arrays.copyOf(arr,k);
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}