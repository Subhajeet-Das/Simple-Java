package com.subhajeet;

final class A10
{
    public void show()
    {
        System.out.println("A10");
    }
}

/*class B8 extends A10        //B8 cannot inherit a final class A10
{
    public void show()
    {
        System.out.println("B8");
    }
}*/

public class Final_Class
{
    public static void main(String[] args)
    {
        A10 obj = new A10();
        obj.show();
    }
}
