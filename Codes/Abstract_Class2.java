package com.subhajeet;

abstract class car
{
    abstract void speed();
}

class Audi extends car
{
    void speed()
    {
        System.out.println("300 kmph");
    }
}

public class Abstract_Class2
{
    public static void main(String[] args)
    {
        car obj = new Audi();
        obj.speed();
    }
}
