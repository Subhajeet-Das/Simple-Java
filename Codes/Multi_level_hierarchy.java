package com.subhajeet;

//java supports only Single, Multi-level and hierarchical level inheritence. it doesn't support multiple and hybrid inheritece
//This it the program of multi-level hierarchy

import java.util.*;
import java.lang.*;
import java.io.*;

class A0
{
    void print_A()
    {
        System.out.println("GRANDPARENTS");
    }
}

class B0 extends A0
{
    void print_B()
    {
        System.out.println("PARENTS");
    }
}

class C0 extends B0
{
    void print_C()
    {
        System.out.println("SIBLINGS");
    }
}

public class Multi_level_hierarchy 
{
    public static void main(String[] args) 
    {
        C0 obj = new C0();        //Object of the class C is created
        
        obj.print_A();
        obj.print_B();
        obj.print_C();
    }
}