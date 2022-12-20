package com.generic;

public class UC4_ExtendMaxValue<E extends Comparable<E>>
{
    E a1 , a2, a3, a4, a5;

    public UC4_ExtendMaxValue(E a1, E a2, E a3, E a4, E a5)
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }
    public static <E extends Comparable<E>> E testMaximum(E a1, E a2, E a3,  E a4, E a5)
    {
        E max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        if (a4.compareTo(max) > 0)
            max = a4;
        if (a5.compareTo(max) > 0)
            max = a5;
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to test maximum of three numbers");
        System.out.println("The maximum of integer is: " +testMaximum(30,20,15,25,35));
        System.out.println("The maximum of float is: " +testMaximum(4.9f, 1.7f, 9.6f,1.8f,2.4f));
        System.out.println("The maximum of string is: " +testMaximum("Apple", "Peach", "Banana","Mango","Pineapple"));

    }
}
