package com.subhajeet;

class Parent
{
    void parent()
    {
        System.out.println("PARENT");
    }
}

class Child1 extends Parent
{
    void child1()
    {
        System.out.println("CHILD 1");
    }
}

class Child2 extends Parent
{
    void child2()
    {
        System.out.println("CHILD 2");
    }
}

class Child3 extends Parent
{
    void child3()
    {
        System.out.println("CHILD 3");
    }
}

public class hierarchical_inheritence
{
   public static void main(String[] args)
   {
       Child1 ch1 = new Child1();       //Object of the class Child1 is created
       ch1.child1();

       Child2 ch2 = new Child2();       //Object of the class Child2 is created
       ch2.child2();

       Child3 ch3 = new Child3();       //Object of the class Child3 is created
       ch3.child3();

       ch1.parent();
       ch2.parent();
       ch3.parent();
   }
}
