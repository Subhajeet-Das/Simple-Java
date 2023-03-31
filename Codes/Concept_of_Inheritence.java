package com.subhajeet;

class A                 //parent/super class
{
    int i,j;
    void showij()
    {
        System.out.println("i and j :- " + i + " and " + j);
    }
}

class B extends A           //child/sub class
{
    int k;
    void showk()
    {
        System.out.println("k :- " + k);
    }

    void sum()
    {
        System.out.println("i+j+k is :- " + (i + j + k));
    }
}

public class Concept_of_Inheritence
{
    public static void main(String[] args)
    {
        A superOb = new A();
        B subOb = new B();
        
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Conetnts of Super Object");
        superOb.showij();
        System.out.println();
        
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Conetnts of Sub Object");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i,j and k in Sub Object:");
        subOb.sum();
    }
}