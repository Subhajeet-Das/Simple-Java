package com.subhajeet;

import java.util.Scanner;

public class Linearsearch
{
    public static void main(String[] arg)
    {
        Scanner n = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner ele = new Scanner(System.in);
        int i, nu, el, pos = -1;
        int[] arr = new int[100];

        System.out.print("Enter the number of input:- ");
        nu = n.nextInt();
        for (i = 0; i < nu; i++)
        {
            System.out.print("Enter the number" + (i+1) +" :- ");
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the element you want to search:- ");
        el = ele.nextInt();

        for (i = 0; i < nu; i++)
        {
            if ( arr[i] == el)
            {
                pos = (i+1);
                break;
            }
        }

        if (pos >= 0)
        {
            System.out.println("\nElement " + el + " is found at position :- " + pos);
        }
        else
        {
            System.out.println("\nElement not found");
        }
    }
}
