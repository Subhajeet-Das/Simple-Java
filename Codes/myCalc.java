package com.subhajeet;

class Calc
{
    int num1;
    int num2;
    //int result;

    public Calc(int num1, int num2)
    {
        this.num1 = num1;         //LHS num1 is a instance variable and RHS num1 is a local variable
        this.num2 = num2;         //LHS num2 is a instance variable and RHS num2 is a local variable
    }
}


public class myCalc {
    public static void main(String[] args)
    {
        Calc obj = new Calc(4,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}