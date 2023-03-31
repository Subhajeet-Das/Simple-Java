package com.subhajeet;

class E4
{
    public void f1()
    {
        System.out.println("f1 of E");
    }
}

class B4 extends E4
{
    public void f1()
    {
        System.out.println("f1 of B");
    }
}

class C4 extends E4
{
    public void f1()
    {
        System.out.println("f1 of C");
    }
}

class A4 extends B4
{
    public void f2()
    {
        System.out.println("f2 of A");
    }
}

public class Hybrid_Inheritence 
{
    public static void main(String[] args) 
    {
        A4 d = new A4();
        d.f1();
    }
}