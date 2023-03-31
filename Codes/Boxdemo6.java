package com.subhajeet;

class Box6
{
    double width;
    double height;
    double depth;

    Box6()       //constructor has the same name as the class
    {
        System.out.println("Constructor");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume()
    {
        return (width*height*depth);
    }
}

public class Boxdemo6
{
    public static void main (String[] args)
    {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is :- " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is :- " + vol);
    }
}