package com.subhajeet;

import java.util.Scanner;

public class evenodd
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n;

        System.out.println("Enter the number:- ");
        n = num.nextInt();
        
        if ((n%2) == 0)
        {
            System.out.println("The number " + n + " is a EVEN number.");
            
        }
        else
        {
            System.out.println("The number " + n + " is a ODD number.");
        }
        
    }
}