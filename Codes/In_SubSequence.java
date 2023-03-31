package com.subhajeet;
import java.util.*;

class Solution
    {
        public boolean isSubsequence(String s, String t)
        {
            int i = 0, j = 0;
            while (i < s.length() && j < t.length())
            {
                if (s.charAt(i) == t.charAt(j))
                {
                    i++;
                }
                j++;
            }
            return i == s.length();
        }
    }
public class In_SubSequence
{


    public static void main(String[] args)
    {
        Solution st = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(st.isSubsequence(s,t));
    }
}
