package com.subhajeet;

class box3
{
    double width;
    double height;
    double depth;

    void volume()
    {
        System.out.println("Volume is :- ");
        System.out.println(width*height*depth);
    }
}

public class Boxdemo3
{
    public static void main(String[] args)
    {
        box3 mybox1 = new box3();
        box3 mybox2 = new box3();
        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();        //display volume of box 1
        mybox2.volume();        //display volume of box 2
    }
}