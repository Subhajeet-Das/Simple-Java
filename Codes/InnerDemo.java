package com.subhajeet;

class Outer
{
    void show()
    {
        System.out.println("hello world");
    }
    
    static class Inner
    {
        public void see()
        {
            System.out.println("\nINNER CLASS");
            
        }
    }
}

public class InnerDemo 
{
    public static void main(String[] args) 
    {
          Outer obj = new Outer();
          obj.show();
          Outer.Inner obj1 = new Outer.Inner();
          obj1.see();
    }
}