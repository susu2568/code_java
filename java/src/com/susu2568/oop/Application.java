package com.susu2568.oop;

import com.susu2568.oop.Demo03.Person;
import com.susu2568.oop.Demo03.Worker;

public class Application {
    public static void main(String[] args) {
        //一个方法的实际类型是确定的
        //可以指向的引用类型是不确定的
//        Worker s1 = new Worker();
//        Person  s2 = new Worker();

        Object object = new Worker();
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Worker);
        //instanceof---类型转换
        //System.out.println(X instanceof Y);--- X Y  是否存在父子关系
        //方法类型的转换----父----->子  直接转换
        //                父<-----子  强制转换   可能会丢失一些方法
    }
}
