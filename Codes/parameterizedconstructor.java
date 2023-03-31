package com.subhajeet;

class Box7
{
    double width;
    double height;
    double depth;
    
    Box7(double w, double h, double d)       //Box is a parameterized constructor method
    {
        width = w;
        height = h;
        depth = d;
    }
    
    double volume()                         //volume is a method
    {
        return (width*height*depth);
    }
}

public class parameterizedconstructor
{
    public static void main(String[] args)
    {
        Box7 mybox1 = new Box7(10,90,15);     // mybox1 is a object of the class Box
        Box7 mybox2 = new Box7(3,6,9);        // mybox2 is a object of the class Box
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume 1 is :- " + vol);
        vol = mybox2.volume();
        System.out.println("Volume 2 is :- " + vol);
    }
}