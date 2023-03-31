package com.subhajeet;

//Abstract class --------> Define & Declare
//Interface --------> Declare till java version 1.7
// from java version 1.8 onwards we may define methods in interface

@FunctionalInterface

interface Idemo     //for functional interface or SAM, we can have n numbers of default methods but only one abstract method
{
    void abc();
    //void bcd();
    default void show()     // "default" keyword helps to define an abstract method with the body inside interface as interface doesn't support defining a body of a method inside that method
    {
        System.out.println("SVIST");
    }
    default void cse2()
    {
        System.out.println("CSE");
    }
    default void ece()
    {
        System.out.println("ECE");
    }
}

class Interface_demo implements Idemo
{
    public void abc()
    {
        System.out.println("In abc");
    }
    public void cse2()          //we can also override the default method of an interface
    {
        System.out.println("Overridden CSE");
    }
}

public class Default_Method_in_Interface
{
    public static void main(String[] args)
    {
        Idemo obj = new Interface_demo();
        obj.abc();
        obj.show();
        obj.cse2();
        obj.ece();
    }
}