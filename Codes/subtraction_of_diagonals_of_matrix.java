package com.subhajeet;
import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.SQLOutput;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class subtraction_of_diagonals_of_matrix
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of the square matrix : ");
        int n = sc.nextInt();
        int[][] arr = new int[100][100];
        int sf=0, sb=0;
        System.out.println("Enter the values :");
        //for principle diagonal
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
                if ( i==j )
                {
                    sf = sf + arr[i][j];
                }
            }
        }
        sc.close();
        //for secondary diagonal
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if ( (i+j) == (n-1) )
                {
                    sb = sb + arr[i][j];
                }
            }
        }
        int out = sf - sb;
        System.out.print("Result of the subtraction is : ");
        if ( out >= 0)
        {
            System.out.println(out);
        }
        else
        {
            System.out.println(out*(-1));
        }
    }
}