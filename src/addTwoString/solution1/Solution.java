package addTwoString.solution1;

public class Solution {
    public static void main(String[] args) {
        String num1="3876620623801494171",num2= "6529364523802684779";
        String ans=addStrings(num1,num2);
        System.out.println(ans);
    }
    public static String addStrings(String num1, String num2) {
        char[] char1=num1.toCharArray();
        char[] char2=num2.toCharArray();
        int i=char1.length-1,j=char2.length-1,index=0,count=0;
        long ans=0;
        while(i>=0 || j>=0){
            int n1=i>=0?char1[i]-'0':0;
            int n2=j>=0?char2[j]-'0':0;
            int sum=n1+n2+count;
            count=sum/10;
            sum=sum%10;
            ans=ans+(long)(sum*Math.pow(10,index));
            index++;
            i--;
            j--;
        }
        if(count==1){
            ans=ans+(long)(count*Math.pow(10,index));
        }
        StringBuffer s=new StringBuffer("abc");
        System.out.println(s);
        return Long.toString(ans);
    }
}