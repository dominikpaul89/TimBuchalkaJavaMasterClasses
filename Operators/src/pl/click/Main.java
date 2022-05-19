package pl.click;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+ 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1+1 = " + result);

        result--;
        System.out.println("2-1 = " + result);

        result += 2;
        System.out.println("1+2 = " + result);

        result *= 10;
        System.out.println("3*10 = " + result);

        result /= 3;
        System.out.println("30/3 = " + result);

        result -= 2;
        System.out.println("10-2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("First or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int mainValue = 50;
        boolean miValue = mainValue < 75 ? true : false;
        if (miValue) {
            System.out.println("O kurwa umisz");
        }

//        zadanie

        double firstValue = 20.00;
        double secondValue = 80.00;

        double myResult = firstValue + secondValue;
        double myCalculation = myResult * 100d;

        double myNewResult = myCalculation % 40.00d;

        boolean finalTask = myNewResult == 0 ? true : false;

        System.out.println(finalTask);
        System.out.println(myNewResult);
        System.out.println(myCalculation);

        }
    }


