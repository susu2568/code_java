package com.susu2568.oop.Demo01;
//一个项目只有一个main方法
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "小明";
        student.age = 9;
        student.age();
        student.study();
    }
}
