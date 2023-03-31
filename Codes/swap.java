package com.subhajeet;

import java.util.Scanner;

public class swap
{
    public static void main(String[] args)
    {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int temp,n1,n2;

        System.out.println("Enter the first number:- ");
        n1 = num1.nextInt();
        System.out.println("Enter the second number:- ");
        n2 = num2.nextInt();
        
        temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("After swapping the first and the second number is - " + n1 + " and " + n2);
    }
}