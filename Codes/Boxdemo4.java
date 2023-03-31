package com.subhajeet;

class box4
{
    double width;
    double height;
    double depth;

    double volume()
    {
        return width*height*depth;
    }
}

public class Boxdemo4 {
    public static void main(String[] args) {
        box4 mybox1 = new box4();
        box4 mybox2 = new box4();
        double vol;
        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();        //display volume of box 1
        System.out.println("Volume is:- " + vol);
        vol = mybox2.volume();      //display volume of box 2
        System.out.println("Volume is:- " + vol);
    }
}