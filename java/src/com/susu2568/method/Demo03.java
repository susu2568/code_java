package com.susu2568.method;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(f(3));
    }
    public static int f(int n){
        if (n==1){
           return 1;
        }else {
            return n*f(n-1);
        }
    }
}
