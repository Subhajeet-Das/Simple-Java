package com.subhajeet;

import java.util.*;
class Solution1 {
    public boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i=0; i< s.length(); i++)
        {
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
            {
                return false;
            }
            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
    }
}
public class Isomorphic_string
{
    public static void main(String[] args)
    {
        Solution1 st = new Solution1();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(st.isIsomorphic(s,t));
    }
}
