package com.subhajeet;

class box2
{
    double width;
    double height;
    double depth;
}

public class Boxdemo2
{
    public static void main(String[] args)
    {
        box2 mybox1 = new box2();
        box2 mybox2 = new box2();
        double vol1, vol2;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

        vol1 = mybox1.depth * mybox1.height * mybox1.width;

        mybox2.width = 60;
        mybox2.height = 70;
        mybox2.depth = 25;

        vol2 = mybox2.depth * mybox2.height * mybox2.width;

        System.out.println("Volume1 is :- " + vol1 + " and Volume2 is :- " + vol2);
    }
}
