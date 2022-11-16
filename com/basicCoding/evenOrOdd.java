package com.basicCoding;
import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println(operation());
    }

    static boolean operation() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
