package com.susu2568.oop.Demo02;

public class person {
    String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }


    public void say(){
        System.out.println("说");
    }

    protected int  age = 20;
}

//alt + inscrlk   生成构造器
