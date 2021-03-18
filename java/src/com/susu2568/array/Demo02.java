package com.susu2568.array;

public class Demo02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
//        for (int i = array.length-1; i >-1 ; i--) {
//            System.out.println(array[i]);
        for (int i = 1; i < args.length-1 ; i++) {
            System.out.println(array[-i]);
        }
        }
    }

