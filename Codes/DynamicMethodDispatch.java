package com.subhajeet;

class A3
{
    void callme()
    {
        System.out.println("Inside A");
    }
}

class B3 extends A3
{
    void callme()
    {
        System.out.println("Inside B");
    }
}

class C3 extends A3
{
    void callme()
    {
        System.out.println("Inside C");
    }
}

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();
        
        A3 r;        //Obtain reference of type A
        r = a;      //r refers to an A object a
        r.callme();
        
        r = b;      //r refers to an B object b
        r.callme();
        
        r = c;      //r refers to an C object c
        r.callme();
    }
}