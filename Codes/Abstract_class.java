package com.subhajeet;

abstract class dog
{
    public abstract void eat();
    
    public void walk()
    {
        System.out.println("Hi");
    }
}

class pug extends dog
{
    public void eat()
    {
        System.out.println("eat something");
    }
}

public class Abstract_class
{
    public static void main(String[] args)
    {
        dog obj = new pug();
        obj.walk();
        obj.eat();
    }
}