package pl.click;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int fctr = 1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                fctr = i;
                System.out.println(fctr);
            }
        }

    }
}
