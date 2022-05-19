package pl.click;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers =SortedArray.getIntegers(6);
        int[] sorted = SortedArray.sortIntegers(myIntegers);
        SortedArray.printArray(sorted);




    }
}
