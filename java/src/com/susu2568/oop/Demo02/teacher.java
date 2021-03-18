package com.susu2568.oop.Demo02;

public class teacher extends person{
    public static void main(String[] args) {
        teacher teacher = new teacher();
        teacher.say();
    }

    private int age = 9;
    public void test(int age){
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}


// ctrl + H  显示继承关系
// object 类  所有类默认继承
//只有单继承------一个儿子只有一个爸爸
//              一个爸爸可以有多个儿子