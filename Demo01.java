package com.susu2568.array;

public class Demo01 {
    public static void main(String[] args) {
//        int[] nums;
//        nums = new int[10];
        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }


}
