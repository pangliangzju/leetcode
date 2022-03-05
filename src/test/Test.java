package test;


import javafx.util.Pair;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        double b = scanner.nextDouble();
//        scanner.nextLine();
//        String s = scanner.nextLine();
//        System.out.println(a);


//        String s="123";
//        int a=Integer.parseInt(s);
//        System.out.println(a+1);


//        char c1='a';
//        char c2='A';
//        System.out.println(Character.isDigit(c1));
//        System.out.println(Character.isLetter(c1));
//        System.out.println(Character.toLowerCase(c2));
//        System.out.println(Character.toUpperCase(c1));

        Pair<String, Integer> pair = new Pair<>("123", 4);
        LinkedList<Integer> list=new LinkedList<>();
        try {
            InetAddress address = InetAddress.getByName("localhost");
            String name = address.getHostName();
            String ip = address.getHostAddress();
            System.out.println(name+"---"+ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
