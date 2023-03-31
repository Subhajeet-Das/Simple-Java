package com.subhajeet;

import java.util.Scanner;

public class LargestAmongThree
{
    public static void main(String[] args)
    {
        Scanner num3 = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Enter the first number:- ");
        n1 = num1.nextInt();
        System.out.println("Enter the second number:- ");
        n2 = num2.nextInt();
        System.out.println("Enter the third number:- ");
        n3 = num3.nextInt();
        
        if (n1>n2 && n1>n3)
        {
            System.out.println("The largest number among the numbers " + n1 + " , " + n2 + " , " + n3 + " is :- " + n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println("The largest number among the numbers " + n1 + " , " + n2 + " , " + n3 + " is :- " + n2);
        }
        else
        {
            System.out.println("The largest number among the numbers " + n1 + " , " + n2 + " , " + n3 + " is :- " + n3);
        }
    }
}