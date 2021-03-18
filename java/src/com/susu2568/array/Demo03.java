package com.susu2568.array;
import java.util.Arrays;
public class Demo03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,40,900,500,4};


        //打印数组元素Arrays.toString(a)
        System.out.println(Arrays.toString(a));


        //数组进行排序    升序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j+1] >a[j]){
                    temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
