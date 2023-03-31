package com.subhajeet;

import java.util.Scanner;

public class PrimeInRange
{
    public static void main(String[] args)
    {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int i,j,n1,n2,flag;

        System.out.println("Enter the floor value:- ");
        n1 = num1.nextInt();
        System.out.println("Enter the ceiling value:- ");
        n2 = num2.nextInt();

        for(i = n1; i <= n2; i++)       //for loop to get floor to ceiling value
        {
            flag = 1;
            for(j = 2; j <= i-1; j++)   //generates the numbers to divide the value of i to check for prime
            {
                if (i%j == 0)           //checks whether the number is prime or not
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0)
            {
                System.out.println("The number " + i + " is not a prime number");
            }
            else
            {
                System.out.println("The number " + i + " is a prime number");
            }
        }
    }
}
