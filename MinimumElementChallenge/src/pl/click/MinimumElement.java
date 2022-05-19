package pl.click;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readInteger(int count){
        System.out.println("Enter the number");

        for (int i=0; i< 2; i++){
             i = scanner.nextInt();
        }
        int number =+ i;
        return number;
    }

    public static int[] readElements (int number){
        number = readInteger();
        int [] values = new int[number];

        for (int i=0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(values));
        return values;

    }


    public static int findMin(int [] array){
        Arrays.sort(array);
        int min = array[0];
        System.out.println("the min number is " + min);
        return min;
    }
}
