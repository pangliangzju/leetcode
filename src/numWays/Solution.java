package numWays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }

    public static int numWays(int n) {

        int a = 1, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (int) ((a + b) % (1e9 + 7));
            a = b;
            b = sum;
        }
        return a;
    }
}
