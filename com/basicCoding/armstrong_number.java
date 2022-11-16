package com.basicCoding;
public class armstrong_number {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) 
            if (armstrong(i))
                System.out.print(i+" ");
    }
    static boolean armstrong(int num){
        int original=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        return sum==original;
    }
}