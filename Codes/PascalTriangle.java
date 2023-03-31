package com.subhajeet;

import java.util.Scanner;

class pt
{
    int factorial(int n)
    {
        int fact = 1 , f;

        for(f = 1; f <= n; f++)
        {
            fact = fact * f;
        }
        return fact;
    }

    int nCr(int n,int r)
    {
        int comb;
        comb = factorial(n) / (factorial(n - r) * factorial(r));
        return comb;
    }
}

public class PascalTriangle
{
    public static void main(String[] args)
    {
        pt combination = new pt();
        Scanner num = new Scanner(System.in);
        //System.out.println();
        int n, i, j;

        System.out.println("Enter the number of rows:- ");
        n = num.nextInt();

        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++)
            {
                System.out.print(" " + combination.nCr(i, j));
            }
            System.out.println();
        }
    }
}
