package com.basicCoding;
public class primeNumber {
    public static void main(String[] args) {
        int num = 345;
        boolean isprime=true;
        if(num<2){
            isprime=false;
        }
        else{
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    isprime=false;
                    break;
                }
            }
        }
        String result =  isprime ?"prime":"not prime" ;
        System.out.println("The number "+num+" is "+result);
    }
}
