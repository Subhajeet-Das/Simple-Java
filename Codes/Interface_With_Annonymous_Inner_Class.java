package com.subhajeet;

interface Abc
{
    void show();
}

class Svist implements Abc
{
    public void show()
    {
        System.out.println("NO PROBLEM");
    }
}

public class Interface_With_Annonymous_Inner_Class
{
    public static void main(String[] args)
    {
        Abc obj = new Abc()
                        {
                            public void show()
                            {
                                System.out.println("CSE 2nd Year");
                            }
                        };
        obj.show();
    }
}