package com.basicCoding;
import java.util.Scanner;
public class sumOfnumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number");
        int lower=sc.nextInt();
        System.out.println("enter ending  number");
        int higher=sc.nextInt();
        int count=0;
        for (int i = lower; i <= higher; i++) {
            count+=i;
        }
        System.out.println(count);
        sc.close();
    }
}
