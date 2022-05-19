package pl.click;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

//        variaablees
        double avgSum = 0;
        int sum = 0;
        long avg = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int num = scanner.nextInt();
                scanner.nextLine();
                count++;

                sum += num; //calculate sum

                avgSum += num; // calculate average
                avg = (long) Math.round(avgSum/count);

            } else {
                System.out.println("SUM = "+ sum +" AVG = "+ avg);
                scanner.close();
                break;
            }

        }

    }
}