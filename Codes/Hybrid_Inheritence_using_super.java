package com.subhajeet;

class E5
{
    public void f1()
    {
        System.out.println("f1 of E");
    }
}

class B5 extends E5
{
    public void f1()
    {
        super.f1();
        System.out.println("f1 of B");
    }
}

class C5 extends E5
{
    public void f1()
    {
        System.out.println("f1 of C");
    }
}

class A5 extends B5
{
    public void f2()
    {
        System.out.println("f2 of A");
    }
}

public class Hybrid_Inheritence_using_super 
{
    public static void main(String[] args) 
    {
        A5 d = new A5();
        d.f1();
    }
}