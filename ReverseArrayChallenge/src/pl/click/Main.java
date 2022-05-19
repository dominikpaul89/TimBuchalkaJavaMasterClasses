package pl.click;

import java.util.*;
import java.util.stream.*;
public class Main
{
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        ReverseArray.reverse();

    }
}