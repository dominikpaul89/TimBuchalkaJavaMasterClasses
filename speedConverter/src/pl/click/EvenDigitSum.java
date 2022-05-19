package pl.click;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int firstDigit = 0;
        int sum = 0;


        while(number!=0) {
            firstDigit = number%10;
            number /= 10;

        if (firstDigit % 2 == 0) {
            sum += firstDigit;

        }
        }

        return sum;
    }
}
