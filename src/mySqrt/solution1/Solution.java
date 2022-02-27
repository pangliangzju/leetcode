package mySqrt.solution1;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static double mSqrt(double x){
        double n=x;
        while(Math.abs(n-x/n)>1e-2){
            n=(n+x/n)/2.0;
        }
        return n;
    }

    public static void main(String[] args) {
        double ans=mSqrt(3);
        System.out.println(ans);
        System.out.println(1e-2);
        System.out.println(Math.sqrt(3));
        List<Integer> list=new LinkedList<>();
        list.add(null);
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
