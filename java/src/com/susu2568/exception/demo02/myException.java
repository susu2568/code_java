package com.susu2568.exception.demo02;

public class myException extends Exception{
    private int detail;

    public void  myException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "myException{" +
                "detail=" + detail +
                '}';
    }
}
