package pl.click;

import java.util.Arrays;

public class ReverseArray {



    public static void reverse() {
         Integer[] intArray = {10,20,30,40,50,60,70,80,90};


        for(
    int i = intArray.length - 1;
    i>=0;i--)
            System.out.println(Arrays.toString(intArray));

    }

}