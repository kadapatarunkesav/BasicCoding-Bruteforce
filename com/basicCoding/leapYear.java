package com.basicCoding;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        leaplogic(num);
        System.out.println(leaplogic(num));
        sc.close();
    }

    static boolean leaplogic(int year) {
        if(year%400==0||year%4==0 && year%100!=0)
            return true;
        else
            return false;
    }
}
