package com.subhajeet;

class A6
{
    void f1()
    {
        System.out.println("PROPERTY OF A");
    }
}
class B6 extends A6
{
    void f2()
    {
        System.out.println("PROPERTY OF B");
    }
}

public class Single_Inheritance
{
    public static void main(String[] args)
    {
        B6 d = new B6();
        d.f2();
        d.f1();
    }
}
