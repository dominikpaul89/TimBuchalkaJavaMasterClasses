package pl.click;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        int [] myIntArray = new int[30];
////        myIntArray[5]= 50;
//        for (int i=0; i< myIntArray.length ; i++){
//            myIntArray[i]=i*10;
//            System.out.println("Element "+i+", value is "+myIntArray[i]);
//        }
        int[] myIntegers = getIntegers(5);



        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }
            System.out.println("Average is "+ getAverage(myIntegers));

        Arrays.sort(myIntegers);
        System.out.println(Arrays.toString(myIntegers));


    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" integer values \r");
        int [] values = new int[number];

        for (int i=0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+= array[i];
        }
        return (double) sum/ (double) array.length;
    }



}
