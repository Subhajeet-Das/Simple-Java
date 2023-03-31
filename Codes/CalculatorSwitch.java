package com.subhajeet;

import java.util.Scanner;

public class CalculatorSwitch
{
    public static void main(String[] args)
    {
        Scanner choice = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int n1,n2,res=0;
        char operation;

        System.out.println("\n\t\t--Calculator--\n\nEnter the first number:- ");
        n1 = num1.nextInt();
        System.out.println("Enter the second number:- ");
        n2 = num2.nextInt();
        System.out.println("Enter the operation:- ");
        operation = choice.next().charAt(0);

        switch (operation)
        {
            case '+':
            {
                res = n1 + n2;
                break;
            }

            case '-':
            {
                res = n1 - n2;
                break;
            }

            case '*':
            {
                res = n1 * n2;
                break;
            }

            case '/':
            {
                res = n1 / n2;
                break;
            }

            case '%':
            {
                res = n1 % n2;
                break;
            }

            default:
            {
                System.out.println("INVALID INPUT");
            }
        }
        
        System.out.println("The result of the operation (" + n1 + " " + operation + " " + n2 + ") is:- " + res);
        
    }
}