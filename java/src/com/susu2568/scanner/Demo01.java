package com.susu2568.scanner;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法接收：");
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        scanner.close();
    }
    }
//out:
//    使用next方法接收：
//    hello world
//    输出的内容为：hello world


}
//out :
// 使用next方法接收：
//hello wrold
//输出的内容为：hello