package com.susu2568.oop.Demo05;
//匿名类
public class Test {
    public static void main(String[] args) {
        new Apple().eat();
        new userService() {
            @Override
            public void hello() {
            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface userService{
    void hello();
}