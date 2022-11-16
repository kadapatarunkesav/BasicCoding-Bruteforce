package com.basicCoding;
import java.util.Scanner;
public class greaternumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println(" Enter the first number");
        num1=sc.nextInt();
        System.out.println(" Enter the second number");
        num2=sc.nextInt();
        sc.close();
        String result = num1<num2 ? "Greater": "Less";
        System.out.println(num2+" is "+result+" than "+num2);
    }
}
