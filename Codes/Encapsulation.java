package com.subhajeet;

//Encapsulation is binding of data using Methods

class Student
{
    private int rollno;
    private String name;
    
    //Getters and Setters
    public void setRollno(int r)
    {
        rollno = r;
    }
    
    public int getRollno()
    {
        return rollno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Student sl = new Student();
        sl.setRollno(41);
        sl.setName("Subhajeet");
        System.out.println(sl.getRollno());
        System.out.println(sl.getName());
    }
}