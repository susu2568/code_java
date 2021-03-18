package com.susu2568.oop.Demo05;

public class Outer {
    private int id=20;
    public void out(){
        System.out.println("这是一个外部类");
    }

    public class Inter{
        public void in(){
            System.out.println("这是一个内部类");
        }

        //获得外部类的私有属性
        public void getId(){
            System.out.println(id);
        }
    }

}
