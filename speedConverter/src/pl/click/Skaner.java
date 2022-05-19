package pl.click;

import java.util.Scanner;

public class Skaner {
    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {


            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid Value");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}





