package com.subhajeet;

//program of SUPER. when we pass B(5), it accesses the default constructor of class A and Parameterized Constructor of class B.
class A2
{
    public A2()      //constructor of class A
    {
        System.out.println("A");
    }
    
    public A2(int i)
    {
        System.out.println("Parameterized A");
    }
}

class B2 extends A2       //B is a sub class of A
{
    public B2()      //constructor of class B
    {
        super();        //java automatically puts a super() by default
        System.out.println("B");
    }
    
     public B2(int j)
    {
        super(j);       //java automatically puts a super() by default and as we pass parameter in B (i.e, the value of j which is also associated with parameterized A) it also accesses the parameterized constructor of A not default Constructor
        System.out.println("Parameterized B");
    }
}

public class SuperDemo
{
    public static void main(String[] args)
    {
        A2 obj1 = new A2();       //obj1 is the object of Class A
        B2 obj2 = new B2(5);       //obj2 is the object of Class B
    }
}