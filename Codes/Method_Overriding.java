package com.subhajeet;

class flower
{
    public void disp()
    {
        System.out.println("Having sweet fragrance");
    }
}

class Tube_Rose extends flower
{
    public void disp()
    {
        System.out.println("Having rich and powerful fragrance");
    }
}

public class Method_Overriding
{
    public  static void main(String[] args)
    {
        Tube_Rose t = new Tube_Rose();
        t.disp();
    }
}
