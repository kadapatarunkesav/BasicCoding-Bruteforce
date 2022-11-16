package com.basicCoding;
import java.util.Scanner;
public class positveOrNegativeNumber{
    public static void main(String[] args) {
        greater(0, 0);
    }
    static void greater(int num1,int num2) {
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        if(num1>num2){
            System.out.println(num1+ " is greater than "+num2);
        }
        else{
            System.out.println(num2+ " is greater than "+num1);
        }
        sc.close();
    }
}