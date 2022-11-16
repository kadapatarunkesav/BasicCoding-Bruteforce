package com.basicCoding;
import java.util.Scanner;
public class greatThreeNumbers {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int ans = num1>num2 ? num1:num2;
        int result=ans>num3? ans:num3;
        System.out.println(result +
        " is the greatest number of all");
        sc.close();
    }
}
