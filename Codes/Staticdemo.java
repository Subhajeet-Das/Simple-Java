package com.subhajeet;

class Emp
{
    int eid;
    int salary;
    static String ceo;      //if you don't want a variable be object specific then declare it as "static" so this value is static for every object, and it takes it's last input as constant
    
    public void show()
    {
        System.out.println("Employ id : " + eid + "\t Salary : " + salary + "\t CEO : " + ceo);
    }
}

public class Staticdemo {
    public static void main(String[] args) 
    {
        Emp A = new Emp();
        A.eid = 100;
        A.salary = 5000;
        A.ceo = "jack Ma";
        
        Emp B = new Emp();
        B.eid = 200;
        B.salary = 6000;
        B.ceo = "Elon Musk";
        
        A.show();
        B.show();
    }
}