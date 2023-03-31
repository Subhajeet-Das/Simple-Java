package com.subhajeet;

class A9
{
    public final void Show()
    {
        System.out.println("A9");
    }
}

class B7 extends A9
{
    public void show()
    {
        System.out.println("B7");
    }
}

public class Final_Method
{
    public static void main(String[] args)
    {
        B7 obj = new B7();
        obj.show();
    }
}
