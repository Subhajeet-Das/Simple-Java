package com.subhajeet;

interface printable
{
    void print();
}

interface Showable
{
    void show();
}

class Printer implements printable, Showable
{
    public void print()
    {
        System.out.println("hi");
    }

    public void show()
    {
        System.out.println("CSE");
    }
}

public class Multiple_Inheritance_Using_Interface
{
    public static void main(String[] args)
    {
        Printer obj = new Printer();
        obj.print();
        obj.show();
    }
}
