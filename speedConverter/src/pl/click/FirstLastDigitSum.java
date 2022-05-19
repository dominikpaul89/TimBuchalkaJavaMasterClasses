package pl.click;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;

        lastDigit = number%10;
//        System.out.println("Last digit: "+lastDigit);

        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
//        System.out.println("First digit: "+firstDigit);

        sum = firstDigit + lastDigit;

        return sum;
    }
}
