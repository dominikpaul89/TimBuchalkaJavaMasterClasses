package pl.click;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readingChallenge(){

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        System.out.println("Enter number #" + count);
        boolean isAnInt = scanner.hasNextInt();
        int sum = 0;

        if (isAnInt){

            while (count <= 10) {
                int number = scanner.nextInt();
                count++;

                sum +=number;
                System.out.println("Enter number #" + count);
            }
            scanner.close();

            System.out.println("the sum is " + sum);



        } else {
            System.out.println("Invalid Number");
        }

    }

}
