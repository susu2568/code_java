package com.susu2568.oop.Demo01;
//学生类
public class Student {
    String name ;
    int age ;

    public void study(){
        System.out.println(this.name+"在学习");
    }

    public void age() {
        System.out.println("年龄:"+this.age+"岁");
    }
}
