package com.subhajeet;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_of_file {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine())
        {
            String str = sc.nextLine();
            if ( str == "end-of-file")
            {
                i++;
                System.out.println(i + " " + str);
                break;
            }
            else
            {
                i++;
                System.out.println(i + " " + str);
            }
        }
        sc.close();
    }
}
