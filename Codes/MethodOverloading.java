package com.subhajeet;

class Overloading
{
    void test()
    {
        System.out.println("No Parameter");
    }

    void test(int a)
    {
        System.out.println("a:- " + a);
    }

    void test(int a, int b)
    {
        System.out.println("a and b:- " + a + " " + b);
    }

    double test(double a)
    {
        System.out.println("double a:- " + a);
        return a*a;
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Overloading obj = new Overloading();
        double result;

        obj.test();
        obj.test(10);
        obj.test(10,20);
        result = obj.test(123.25);

        System.out.println("Result of obj.test(123.25):- " + result);
    }
}
