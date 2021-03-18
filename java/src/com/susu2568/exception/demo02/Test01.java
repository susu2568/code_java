package com.susu2568.exception.demo02;

public class Test01 {
     public void  test(int a) throws Exception{
        if (a>10){
            throw new myException();
        }
        System.out.println("ok");
    }

    public  void main(String[] args) throws Exception {
        try {
            test(10);
        } catch (myException e) {
            System.out.println("myException=>"+e);
        }
    }
}
