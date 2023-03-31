package com.subhajeet;

public class AutoBoxing_Wrapper
{
    public static void main(String[] args)
    {
        // Converting int to Integer
        int a = 10;
        Integer i = Integer.valueOf(a);     // Converting int to Integer explicitly
        Integer j = a;      // Autoboxing

        System.out.println(a + " " + i + " " + j);
    }
}
