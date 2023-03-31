package com.subhajeet;

import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth term for the Fibonacci series:- ");
        int nu = sc.nextInt();

        int a = 0, b = 1, c, i;

        System.out.println("The fibonacci series is :- ");
        System.out.print(a + " " + b);

        for (i = 2; i < nu; i++)
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}