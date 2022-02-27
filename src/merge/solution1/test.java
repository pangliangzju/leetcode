package merge.solution1;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class test {
    static int[] nums = new int[10];

    public static void merge() {
        nums[9] = 0;
        System.out.println(nums.length);
    }


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        merge();
//        System.out.println(nums[0]);
//        StringBuffer s=new StringBuffer();
//        System.out.println(Integer.MIN_VALUE%10);
        LinkedList<Integer> list1 = new LinkedList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(3);
        }};

        while (list1.remove(Integer.valueOf(2)));
        ArrayList<Integer> llist=new ArrayList<>();


        list1.forEach(node -> System.out.println(node));
    }
}
