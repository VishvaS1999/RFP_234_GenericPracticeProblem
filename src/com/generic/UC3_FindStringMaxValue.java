package com.generic;

public class UC3_FindStringMaxValue
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

    public static Float testMaximum(Float x, Float y, Float z)
    {
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static String testMaximum( String  x,  String  y,  String  z)
    {
        String  max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to test maximum of three numbers");
        System.out.println("The maximum of integer is: " +testMaximum(30,20,15));
        System.out.println("The maximum of float is: " +testMaximum(4.9f, 1.7f, 9.6f));
        System.out.println("The maximum of string is: " +testMaximum("Apple", "Cherry", "Banana"));
    }
}
