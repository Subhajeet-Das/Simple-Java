package com.subhajeet;

interface Rate_of_Interest
{
    float rate();
}

class SBI implements Rate_of_Interest
{
    public float rate()
    {
        return 9.5f;
    }
}

class UBI implements Rate_of_Interest
{
    public float rate()
    {
        return 0.9f;
    }
}

public class Interface_With_Multiple_Sub_Class
{
    public static void main(String[] args)
    {
        SBI r = new SBI();
        UBI ra = new UBI();
        float n = r.rate();
        float na = ra.rate();
        System.out.println("\t-:Interest Rate:- \nSBI:- " + n + " | UBI:- " + na);
    }
}
