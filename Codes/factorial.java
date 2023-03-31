package com.subhajeet;

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n,i,res=1;
        System.out.println("Enter the number to get the factorial:- ");
        n = num.nextInt();
        
        if ( n == 0 || n == 1)
        {
            System.out.println("The Factorial of the number " + n + " is :- " + 1);
            
        }
        else
        {
            for(i = 1; i <= n; i++)
            {
                res = res*i;
            }
            System.out.println("The Factorial of the number " + n + " is :- " + res);
        }
        
    }
}