package com.subhajeet;

interface Printable
{
    void print();
}

class SVIST implements Printable
{
    public void print()
    {
        System.out.println("CSE");
    }
}

public class Interface1
{
    public static void main(String[] args)
    {
        SVIST cse = new SVIST();
        cse.print();
    }
}
