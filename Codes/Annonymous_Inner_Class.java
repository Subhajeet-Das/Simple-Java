package com.subhajeet;

class A7
{
    void show()
    {
        System.out.println("in Class A");
    }
}

/*class B7 extends A7
{
    void show()
    {
        System.out.println("in Class B");
    }
}*/

public class Annonymous_Inner_Class
{
    public static void main(String[] args)
    {
        A7 obj = new A7()     //we will annonymous class if you need to use a local class only once
                    {
                        void show()
                        {
                            System.out.println("SVIST");
                        }
                    };
        obj.show();
        
        A7 newobj = new A7();
        newobj.show();
    }
}