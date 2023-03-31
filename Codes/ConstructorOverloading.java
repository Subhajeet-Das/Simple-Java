package com.subhajeet;

class Calculator
{
    int base;
    int attendance;
    String operation;
    
    public Calculator()
    {
        base = 0;
        attendance = 10;
        operation = "Nothing";
        System.out.println("Base marks:- " + base + "\tattendance :- " + attendance + "\toutput :- " + operation);
    }
    
    public Calculator(int i)
    {
        base = i;
        attendance = 50;
        operation = "Good";
        System.out.println("Base marks:- " + base + "\tattendance :- " + attendance + "\toutput :- " + operation);
    }
    
    public Calculator(int i, int j)
    {
        base = i;
        attendance = j;
        operation = "Excellent";
        System.out.println("Base marks:- " + base + "\tattendance :- " + attendance + "\toutput :- " + operation);
    }
    
     public Calculator(int i, int j, String op)
    {
        base = i;
        attendance = j;
        operation = op;
        System.out.println("Base marks:- " + base + "\tattendance :- " + attendance + "\toutput :- " + operation);
    }
    
}

public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator(10);
        Calculator obj3 = new Calculator(20, 30);
        Calculator obj4 = new Calculator(40, 50, "Outstanding");
    }
}