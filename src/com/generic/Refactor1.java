package com.generic;

public class Refactor1
{
    public static <E extends Comparable<E>> E testMaximum(E a1, E a2, E a3)
    {
        E max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
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
