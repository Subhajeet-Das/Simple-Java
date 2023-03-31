package com.subhajeet;

class Keyword
{
    public void show(Number i)
    {
        System.out.println(i);
    }
}

public class Abstract_Keyword
{
    public static void main(String[] args)
    {
        Keyword obj = new Keyword();
        obj.show(9.8);
        obj.show(15);
    }
}
