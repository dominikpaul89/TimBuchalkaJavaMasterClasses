package pl.click;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myValue = 10;
        int anotherIntValue = myValue;

        anotherIntValue++;
        System.out.println("My value is " + myValue);
        System.out.println("anotherArray  = " + anotherIntValue);

        int[] myArray = new int[5];
        int [] anotherArray = myArray;
        Arrays.sort(anotherArray);


        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray  = " + Arrays.toString(anotherArray));

        anotherArray [0] = 1;

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray  = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{ 4,5,6,7,8};
        modifyArray(myArray);

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray  = " + Arrays.toString(anotherArray));
    }
    private static void modifyArray(int [] array){
        array[0] = 2;
        array = new int[] {3,4,6,2,1};
    }
}
