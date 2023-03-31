package com.subhajeet;

class Box5
{
    double width;
    double height;
    double depth;

    double volume()
    {
        return (width*height*depth);
    }

    void setDim(double w, double h, double d)       //set the dimension
    {
        width = w;
        height = h;
        depth = d;
    }
}

public class Boxdemo5
{
    public static void main (String[] args)
    {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        mybox1.setDim(10,20,15);    // it sets the values of  mybox1.width = 10, mybox1.height = 20, mybox1.depth = 15
        mybox2.setDim(3,6,9);       // it sets the values of  mybox2.width = 3, mybox2.height = 6, mybox2.depth = 9

        vol = mybox1.volume();
        System.out.println("Volume is :- " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is :- " + vol);
    }
}
