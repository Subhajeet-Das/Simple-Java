package com.subhajeet;

interface Idemo2
{
    void abc();
    static void show()      //we can't override a static method so we use dafault keyword for a method in interface in java
    {
        System.out.println("Hi");
    }
}

public class Static_Method_in_Interface
{
    public static void main(String[] args)
    {
        Idemo2.show();
    }
}