package com.subhajeet;

@FunctionalInterface
interface Abc2
{
    void show();
}
public class Functional_Interface
{
    public static void main(String[] args)
    {
        Abc2 obj = new Abc2()
        {
            public void show()
            {
                System.out.println("SVIST");
            }
        };
        obj.show();
    }
}
