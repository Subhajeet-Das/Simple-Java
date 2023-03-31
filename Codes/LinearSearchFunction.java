package com.subhajeet;

import java.util.Scanner;

class ls
{
    Scanner in = new Scanner(System.in);
    int i, pos = -1;
    int[] arr = new int[100];
    void input(int nu)
    {
        for (i = 0; i < nu; i++)
        {
            System.out.print("Enter the number" + (i+1) +" :- ");
            arr[i] = in.nextInt();
        }
    }

    int res(int nu, int el)
    {
        for (i = 0; i < nu; i++)
        {
            if (arr[i] == el)
            {
                pos = (i+1);
                break;
            }
        }
        return pos;
    }
}

public class LinearSearchFunction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        ls obj = new ls();
        int inp, element, result;
        System.out.print("Enter the number of input:- ");
        inp = sc.nextInt();
        obj.input(inp);
        System.out.print("Enter the number you want to search:- ");
        element = e.nextInt();
        result = obj.res(inp, element);
        if (result >= 0)
        {
            System.out.println("\nElement " + element + " is found at position :- " + result);
        }
        else
        {
            System.out.println("\nElement " + element + " Not Found");
        }

    }
}
