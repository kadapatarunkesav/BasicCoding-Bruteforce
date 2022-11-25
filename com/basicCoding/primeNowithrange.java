package com.basicCoding;
import java.util.Scanner;
public class primeNowithrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower,higher;
        lower=sc.nextInt();
        higher=sc.nextInt();
        for (int i = lower; i <= higher; i++) {
            if(isprime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
    static boolean isprime (int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
