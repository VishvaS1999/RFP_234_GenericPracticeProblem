package com.generic;

public class UC1_FindMaxValue
{
    public static Integer testMaximum(Integer x, Integer y, Integer z)
    {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to test maximum of three numbers");
        System.out.println("The maximum of integer is: " +testMaximum(10,20,15));

    }
}
