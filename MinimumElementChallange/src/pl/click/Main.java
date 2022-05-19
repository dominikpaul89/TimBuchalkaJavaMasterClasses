package pl.click;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){

        int [] values = new int[count];

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
    public static void main(String[] args) {
        int [] myIntegers = readIntegers(5);
        int min = findMin(myIntegers);

    }
}
