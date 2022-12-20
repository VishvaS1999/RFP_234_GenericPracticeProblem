package com.generic;

public class UC5_PrintMaxValue<E extends Comparable<E>>
{
    void testMaximum(E a1, E a2, E a3,  E a4, E a5)
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
        printMax(max);
    }
    void printMax(E max)
    {
        System.out.println("maximum value is : "+max);
    }

    public static void main(String[] args)
    {

        System.out.println("Welcome to test maximum of three numbers");
        UC5_PrintMaxValue findMaxValue1 = new UC5_PrintMaxValue();
        findMaxValue1.testMaximum(30,20,15,25,35);
        findMaxValue1.testMaximum(4.9f, 1.7f, 9.6f,1.8f,2.4f);
        findMaxValue1.testMaximum("Apple", "Peach", "Banana","Mango","Pineapple");

    }
}
