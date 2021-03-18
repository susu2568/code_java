package com.susu2568.oop.Demo05;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类来实例化内部类
        Outer.Inter inter = outer.new Inter();
        inter.getId();
    }
}
