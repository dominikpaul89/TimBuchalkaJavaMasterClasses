package pl.click;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMaxChallenge() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max){
                    max = number;
                }

                if (number < min){
                    min = number;
                }
            } else {
                System.out.println("Invalid Value");
                break;
            }
        scanner.nextLine();
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
