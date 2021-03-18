package com.susu2568.exception.Demo01;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
//若需要捕获多个异常   需从小到大
        try {//监控区域
            new Test().a();
        }catch (Throwable e){//捕获异常
            System.out.println("程序异常");
        }finally {//做善后工作
            System.out.println("finally");
        }
        //快捷键  ctrl+alt+T
        try {

            if (b==0) {//throw
                throw new ArithmeticException();//抛出异常
            } else {System.out.println(a/b);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
