package com.subhajeet;

class box1
{
    double width;
    double height;
    double depth;
}

public class Boxdemo1
{
    public static void main(String[] args)
    {
        box1 mybox = new box1();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        vol = mybox.depth * mybox.height * mybox.width;

        System.out.println("Volume is :- " + vol);
    }
}

