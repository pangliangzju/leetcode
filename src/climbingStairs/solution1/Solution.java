package climbingStairs.solution1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author somnu
 */
public class Solution {
    public static void main(String[] args) {
        int ans=climbStairs(13);
        System.out.println(ans);
    }
    public static int climbStairs(int n){
        Set<Integer> set=new HashSet<Integer>();
        int cur;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            if(i%7==0){
                dp[i]=0;
            }
        }
        return dp[n];
    }
}
/**
 * dp[7]==21
 * dp[6]=13
 * 如果不能是7的倍数
 * 那dp[8]应该是13
 * */
