package fib;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        int a=0,b=1,sum=0;
        for(int i=0;i<n;i++){
            sum= (int) ((a+b)%(1e9+7));
            a=b;
            b=sum;
        }
        return a;
    }
}
